package com.service.servicen.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-08T08:30:41.189Z")

@RestSchema(schemaId = "servicen")
@RequestMapping(path = "/servicen", produces = MediaType.APPLICATION_JSON)
public class ServicenImpl {

    @Autowired
    private ServicenDelegate userServicenDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userServicenDelegate.helloworld(name);
    }

}
