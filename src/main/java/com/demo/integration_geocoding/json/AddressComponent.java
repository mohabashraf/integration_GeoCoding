package com.demo.integration_geocoding.json;

import lombok.Data;

@Data
public class AddressComponent {
    private String[] types;
    private String longName;
    private String shortName;
}
