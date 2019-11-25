package com.apifirst.controllor;



import com.apifirst.model.ApiSuccessResponse;
import com.apifirst.model.Carts;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-18T13:25:10.160-06:00")

@Controller
public class ApiController implements CreateApi,GetApi,DeleteApi {

    private static final Logger log = LoggerFactory.getLogger(ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ApiSuccessResponse> createCartService(@ApiParam(value = "User Id",required=true ) @PathVariable("userId") String userId, @ApiParam(value = "Create Cart Request" ,required=true )  @Valid @RequestBody Carts body) {
        // do some magic!
        return new ResponseEntity<ApiSuccessResponse>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteCartService(@ApiParam(value = "User Id",required=true ) @PathVariable("userId") String userId) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Carts> getCartService(@ApiParam(value = "User Id",required=true ) @PathVariable("userId") String userId) {
        // do some magic!
        return new ResponseEntity<Carts>(HttpStatus.OK);
    }


}
