package com.demo.integration_geocoding.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Result {
    @JsonProperty("address_components")
    private AddressComponent[] addressComponents;
    @JsonProperty("geometry")
    private Geometry geometry;
    @JsonProperty("formatted_address")
    private String formattedAddress;
    @JsonProperty("place_id")
    private String placeId;
    @JsonProperty("types")
    private String[] types;
}
