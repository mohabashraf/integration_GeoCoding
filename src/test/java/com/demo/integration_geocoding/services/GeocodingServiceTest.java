package com.demo.integration_geocoding.services;

import com.demo.integration_geocoding.entites.SiteLocation;
import com.demo.integration_geocoding.json.Response;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class GeocodingServiceTest {

    private Logger logger = LoggerFactory.getLogger(GeocodingServiceTest.class);

    @Autowired
    private GeocodingService geocodingService;

    @Test
    void getLocationForGoogleHeadQuarter() {
        SiteLocation googleHeadQuarterLocation =
                geocodingService.getSiteLocation("1600+Amphitheatre+Parkway");
        logger.info(googleHeadQuarterLocation.toString());
        assertEquals(-122, googleHeadQuarterLocation.getLongitude());
        assertEquals(37, googleHeadQuarterLocation.getLatitude());
    }
}