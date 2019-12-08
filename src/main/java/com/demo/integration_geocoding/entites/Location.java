package com.demo.integration_geocoding.entites;

import lombok.Data;

@Data
public class Location {

    private String id;
    private String name;
    private double longitude;
    private double latitude;

}
