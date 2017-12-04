package com.service.servicenew.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-04T09:50:58.650Z")

@RestSchema(schemaId = "demoservice")
@RequestMapping(path = "/demoservice", produces = MediaType.APPLICATION_JSON)
public class DemoserviceImpl {

    @Autowired
    private DemoserviceDelegate userDemoserviceDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userDemoserviceDelegate.helloworld(name);
    }

}
