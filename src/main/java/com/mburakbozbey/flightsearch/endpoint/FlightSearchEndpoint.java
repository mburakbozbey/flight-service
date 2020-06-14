package com.mburakbozbey.flightsearch.endpoint;

import com.mburakbozbey.flightsearch.service.SearchService;
import com.mburakbozbey.xml.flights.FlightSearchRequest;
import com.mburakbozbey.xml.flights.FlightSearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class FlightSearchEndpoint {

    private static final String NAMESPACE = "http://www.mburakbozbey.com/xml/flights";
    @Autowired
    private SearchService service;

    @PayloadRoot(namespace = NAMESPACE, localPart = "FlightSearchRequest")
    @ResponsePayload
    public FlightSearchResponse getFlightStatus(@RequestPayload FlightSearchRequest request) {
        return service.checkFlights(request);
    }

}