package com.demo.integration_geocoding.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Response {
    @JsonProperty("results")
    List<Result> results;
    @JsonProperty("status")
    private String status;

}
