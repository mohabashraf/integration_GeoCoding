package com.demo.integration_geocoding.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AddressComponent {
    @JsonProperty("types")
    private String[] types;
    @JsonProperty("long_name")
    private String longName;
    @JsonProperty("short_name")
    private String shortName;
}
