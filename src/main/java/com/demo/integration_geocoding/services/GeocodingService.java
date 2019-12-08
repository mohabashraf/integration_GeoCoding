package com.demo.integration_geocoding.services;

import com.demo.integration_geocoding.entites.SiteLocation;
import com.demo.integration_geocoding.json.Location;
import com.demo.integration_geocoding.json.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

public class GeocodingService {

    private static final String BASE_URL =
            "https://maps.googleapis.com/maps/api/geocode/json";
    @Value("${integration.google.api_key}")
    private static String API_KEY;
    RestTemplate restTemplate;

    @Autowired
    public GeocodingService(RestTemplateBuilder restTemplateBuilder){
        restTemplate = restTemplateBuilder.build();
    }

    public SiteLocation getSiteLocation(String address) {
        String joinAddress = String.join(",", address);
        Response response =
                restTemplate.getForObject(
                        String.format("%s?address=%s&key=%s", BASE_URL, joinAddress, API_KEY),
                        Response.class);

        return new SiteLocation(UUID.randomUUID().toString(), address,
                response.getResults().get(0).getGeometry().getLocation().getLongitude(),
                response.getResults().get(0).getGeometry().getLocation().getLatitude());

    }


}
