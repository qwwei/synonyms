package com.service.qwwei.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-15T10:06:54.123Z")

@RestSchema(schemaId = "qwwei")
@RequestMapping(path = "/qwwei", produces = MediaType.APPLICATION_JSON)
public class QwweiImpl {

    @Autowired
    private QwweiDelegate userQwweiDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userQwweiDelegate.helloworld(name);
    }

}
