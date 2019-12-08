package com.demo.integration_geocoding.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Geometry {
    @JsonProperty("location")
    private Location location;

}
