package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-11-24T22:29:42.487Z")

@RestSchema(schemaId = "project2hhw")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Project2hhwImpl {

    @Autowired
    private Project2hhwDelegate userProject2hhwDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProject2hhwDelegate.helloworld(name);
    }

}
