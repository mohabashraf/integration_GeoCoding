package com.demo.integration_geocoding.services;

import com.demo.integration_geocoding.entites.SiteLocation;
import com.demo.integration_geocoding.json.Location;
import com.demo.integration_geocoding.json.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class GeocodingService {

    private static final String BASE_URL =
            "https://maps.googleapis.com/maps/api/geocode/json";
    @Value("${api.key}")
    private String API_KEY;
    private RestTemplate restTemplate;

    @Autowired
    public GeocodingService(RestTemplateBuilder restTemplateBuilder){
        restTemplate = restTemplateBuilder.build();
    }

    public Response getSiteLocation(String address) {
        String format = String.format("%s?address=%s&key=%s", BASE_URL, address, API_KEY);
        Response response =
                restTemplate.getForObject(
                        format,
                        Response.class);
        return response;

//        return new SiteLocation(UUID.randomUUID().toString(), address,
//                response.getResults().get(0).getGeometry().getLocation().getLongitude(),
//                response.getResults().get(0).getGeometry().getLocation().getLatitude());
//
    }


}
