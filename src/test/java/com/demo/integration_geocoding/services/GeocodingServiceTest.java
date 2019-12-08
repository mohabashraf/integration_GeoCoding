package com.demo.integration_geocoding.services;

import com.demo.integration_geocoding.entites.SiteLocation;
import com.demo.integration_geocoding.json.Response;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class GeocodingServiceTest {

    @Autowired
    private GeocodingService geocodingService;

    @Test
    void getLocationForGoogleHeadQuarter() {
        Response googleHeadQuarterLocation =
                geocodingService.getSiteLocation("1600+Amphitheatre+Parkway");
        System.out.println(googleHeadQuarterLocation);
//        assertEquals(-122.08, googleHeadQuarterLocation.getLongitude());
//        assertEquals(-122.08, googleHeadQuarterLocation.getLatitude());
    }
}