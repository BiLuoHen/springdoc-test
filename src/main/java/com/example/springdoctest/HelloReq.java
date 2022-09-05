package com.example.springdoctest;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class HelloReq {

    private String name;
    @Schema(type = "array", implementation = HelloEnum.class)
    private List<HelloEnum> option;
}
