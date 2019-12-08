package com.demo.integration_geocoding.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Location {
    @JsonProperty("lat")
    private int latitude;
    @JsonProperty("lng")
    private int longitude;

}
