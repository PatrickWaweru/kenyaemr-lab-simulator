package com.patnox.labs;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/request")
public class SimRequestController {
    private static Logger logger = LoggerFactory.getLogger(SimRequestController.class);
    private RestRequestService restRequestService;

    @Autowired
    public SimRequestController(RestRequestService restRequestService) {
        this.restRequestService = restRequestService;
    }

    // @PostMapping
    // public List<ResultObject> getLabRequestPOST(@RequestBody String query){
    //     logger.info("Entering Lab Request POST Processor");
    //     return restRequestService.getAllResults(query);
    // }
    @PostMapping
    public void getLabResultPOST(@RequestBody String query){
        logger.info("Entering Lab Request POST Processor: " + query);
    }

    @GetMapping
    public List<ResultObject> getLabRequestGET(@RequestParam(name = "order_no") String order_no) {
        logger.info("Entering Lab Request GET Processor: " + order_no);
        return restRequestService.getAllResults(order_no);
    }
}
