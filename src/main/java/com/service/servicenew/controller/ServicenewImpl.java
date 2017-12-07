package com.service.servicenew.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-07T06:21:17.213Z")

@RestSchema(schemaId = "servicenew")
@RequestMapping(path = "/servicenew", produces = MediaType.APPLICATION_JSON)
public class ServicenewImpl {

    @Autowired
    private ServicenewDelegate userServicenewDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userServicenewDelegate.helloworld(name);
    }

}
