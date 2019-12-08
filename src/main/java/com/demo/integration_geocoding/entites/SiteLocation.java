package com.demo.integration_geocoding.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SiteLocation {

    private String id;
    private String name;
    private double longitude;
    private double latitude;

}
