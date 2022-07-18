package com.patnox.labs.labware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class RestLabwarePullEIDService
{
	// private final StatsRepository statsRepository;

	//   @Autowired
	//   public RestStatsService(StatsRepository statsRepository) {
	//     this.statsRepository = statsRepository;
	//   }
	  
	public List<LabwareVLResultObject> getAllResults(String boost)
	{
        System.out.println("Processing: " + boost);
	    List<LabwareVLResultObject> mess = new ArrayList<>();
        String[] orderIds = boost.split(",");
        for(String m : orderIds) {
            LabwareVLResultObject ro = new LabwareVLResultObject(m, "Complete", "1627045", "<LDL", new LabwareVLResultObject.dateObject("2022-04-04 00:00:00.000000", 3, "Africa/Nairobi"), new LabwareVLResultObject.dateObject("2022-04-04 00:00:00.000000", 3, "Africa/Nairobi"));
            mess.add(ro);
            System.out.println("Adding payload for order: " + m);
        }
        return(mess);
	}
}