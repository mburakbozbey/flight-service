
package com.mburakbozbey.flightsearch.endpoint;

import com.mburakbozbey.flightsearch.service.SearchService;
import com.mburakbozbey.xml.flights.FlightSearchRequest;
import com.mburakbozbey.xml.flights.FlightSearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/search")
public class FlightServiceController {
    @Autowired
    SearchService searchService;
    @PostMapping(consumes = {MediaType.APPLICATION_XML_VALUE,
                             MediaType.APPLICATION_JSON_VALUE},
                 produces = {MediaType.APPLICATION_XML_VALUE,
                            MediaType.APPLICATION_JSON_VALUE}
                             )

    public FlightSearchResponse getSearchOut(@RequestBody FlightSearchRequest query){
        return searchService.checkFlights(query);
    }
}