package com.service.testproject.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-07-20T01:29:22.412Z")

@RestSchema(schemaId = "testproject")
@RequestMapping(path = "/test-project", produces = MediaType.APPLICATION_JSON)
public class TestprojectImpl {

    @Autowired
    private TestprojectDelegate userTestprojectDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTestprojectDelegate.helloworld(name);
    }

}
