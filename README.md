# Java Micro services API 

This project provides spring boot auto configuration and as associated Swaager YAML configuration for Java API. The goal of this project is to make its way to auto-generate the controller interfaces and models for your every endpoint. 	


## Contents

* [API First Approach](#api_first_approach)
* [Overview](#overview)
* [Define Yaml](#define_Yaml)
* [Options](#List_Of_Options)
* [How to generate interfaces](#how_to_generate_interfaces)
* [Why `interfaceOnly` option ](#building-the-project-yourself)

---

## API First Approach

![Alt text](/spec/APIFirstApproach.jpg?raw=true "Api First Approach")



## Overview

When it comes to consuming a RESTful service you are facing two problems:

1. You have to read and understand the human-readable API documentation of the RESTful service.
2. You have to create an HTTP request with the right HTTP method, the right HTTP headers on the right URL with the right parameters and the correct JSON in the HTTP body. Especially when the service API changes, the maintenance effort is high.

When developing and maintaining a RESTful service you have the following problems:

1. You have to manually write an API documentation.
2. When you change your service you have to take care of updating the documentation, which is an error-prone task.

Swagger can solve these problems.

As stated this project provides a way to generate the controller/interfaces and models from swagger spec file. This will help you to do minimal configuration work and focus only on the implementation part, not in the boilerplate part of the application.

This sample application will help to understand the YAML definition of single endpoint and how to generate the interfaces from swagger code-gen maven plugin 


## Define Yaml

Open API specification will give you lot of flexibility to mirror your exact business requirement in form of `Markup Language` format.

## Yaml Structure 

```
.
├── Info      - API Description, Author Name, Version, Artifact details
│
├── x-types   - Application Constants used by models
│
├── security  - Endpoint Authentication E.g API Key validation / Oauth Validation
│
├── basePath  - Base Path of your microservice
│
└── produces  - Micro service content type
│
├── Paths     - Base Path of your microservice
│
└── security definitions - Define your endpoint security token validation ( Oauth Request URL and keys)
│
├── definitions - Application model definitions (Bean Classes)
│
└── responses - API Response Model definition (Bean Classes)
```

Please refer /spec/api.yaml 


## Options

**Generate full java application from YAML file**

```

swagger-codegen generate -i dashboard-service/spec/api.yaml -l spring -o dashboard-service -c dashboard-service/spec/Swagger-codegen-options.json

```


**Generate only interface from YAML file**

Please use below maven plugin


## How to generate interfaces

**Add the below plugin into your pom.xml file**

You can define the interface and model package location.

```
	<plugin>
    	<groupId>io.swagger</groupId>
        <artifactId>swagger-codegen-maven-plugin</artifactId>
        <version>2.2.3</version>
        <executions>
            <execution>
                <goals>
                    <goal>generate</goal>
                </goals>
                <configuration>
                    <inputSpec>spec/api.yaml</inputSpec>
                    <language>spring</language>
                    <apiPackage>com.apifirst.controllor</apiPackage>
                	<modelPackage>com.apifirst.model</modelPackage>
                    <configOptions>
                        <sourceFolder>apifirst</sourceFolder>
                        <java8>true</java8>
                        <interfaceOnly>true</interfaceOnly>
                        <generateSupportingFiles>false</generateSupportingFiles>
                    </configOptions>
                </configuration>
            </execution>
        </executions>
    </plugin>
```


## Why `interface only`option?
**Problem:**
Codegen can generate the code for the controllers, but it will be overwritten each
time you change your API specifications and start a generation.

**Solution:**
* Define your API specifications in the .yml file
* Compile, the Maven codegen plugin with the options `java8` and `interfaceOnly` will generate interface and 
model classes in the target directory.
* Manually write controllers that implement the generated interfaces.



## Build the application

Verify you have Maven and Java 8 installed.

```
# Build the jar
mvn clean install

# Run it
java -jar target/Award-Service-1.0.0.jar
```
Then hit [localhost:8088/v1/swagger-ui.html](http://localhost:8088/v1/swagger-ui.html) 