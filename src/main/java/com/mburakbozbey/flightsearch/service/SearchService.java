
package com.mburakbozbey.flightsearch.service;

import org.springframework.stereotype.Service;
import com.mburakbozbey.xml.flights.FlightSearchRequest;
import com.mburakbozbey.xml.flights.FlightSearchResponse;
import org.springframework.util.Assert;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

@Service
public class SearchService {
    public FlightSearchResponse checkFlights(FlightSearchRequest request){

        FlightSearchResponse check = new FlightSearchResponse();

        ArrayList<ArrayList<String>> flightData = new ArrayList<ArrayList<String>>();

        int searchCriteria = request.getSearchCriteria();
        String searchKey = request.getSearchKey().toLowerCase();
        Assert.notNull(searchCriteria, "Search criteria must not be null.");
        Assert.isTrue(searchCriteria < 5 && searchCriteria >-1, "Incorrect search criteria, must be in [0, 1, 2, 3, 4].");
        Assert.hasLength(searchKey, "Search key must not be null and must not the empty.");

        try {
            Scanner read = new Scanner(new File("src/main/resources/flights.txt") , "UTF-8");
            while (read.hasNextLine())
            {
                ArrayList<String> singleFlight = new ArrayList<String>(Arrays.asList(read.nextLine().split(";")));
                if (!(singleFlight.isEmpty())){
                    flightData.add(singleFlight);
                }


            }
            read.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



        for (ArrayList<String> entry : flightData) {
            if (entry.get(searchCriteria).toLowerCase().startsWith(searchKey.toLowerCase())) {
                check.getFlightList().addAll(entry);
                check.getFlightList().add("---");
            }
        }
        Assert.notEmpty(check.getFlightList(), "No flight is available for the search criteria and key.");

        return check;
    }
}
