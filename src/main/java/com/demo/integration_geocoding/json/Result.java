package com.demo.integration_geocoding.json;

import lombok.Data;

@Data
public class Result {

    private AddressComponent addressComponent;
    private Geometry geometry;
    private String formattedAddress;
    private String placeId;
    private String[] types;
}
