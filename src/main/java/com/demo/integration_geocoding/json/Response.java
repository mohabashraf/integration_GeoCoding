package com.demo.integration_geocoding.json;

import lombok.Data;

import java.util.List;

@Data
public class Response {

    List<Result> results;
    private String status;
}
