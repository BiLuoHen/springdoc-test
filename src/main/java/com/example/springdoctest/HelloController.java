package com.example.springdoctest;

import org.springdoc.api.annotations.ParameterObject;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Validated
public class HelloController {

    @GetMapping("hello/flat")
    public String helloFlat(@Validated HelloReq req) {
        return "flat";
    }

    @GetMapping("hello/param_object")
    public String helloObject(@Validated @ParameterObject HelloReq req) {
        return "obj";
    }

    @GetMapping("hello/array_enum")
    public String helloObject(List<HelloEnum> option) {
        return "obj";
    }
}
