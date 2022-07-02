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
@RequestMapping(path = "api/v1/results")
public class SimResultController {
    private static Logger logger = LoggerFactory.getLogger(SimResultController.class);
    private RestResultService restResultService;

    @Autowired
    public SimResultController(RestResultService restResultService) {
        this.restResultService = restResultService;
    }

    // @PostMapping
    // public List<ResultObject> getLabResultPOST(@RequestBody String query){
    //     logger.info("Entering Lab Result POST Processor");
    //     return restResultService.getAllResults(query);
    // }

    @PostMapping
    public void getLabResultPOST(@RequestBody String query){
        logger.info("Entering Lab Result POST Processor: " + query);
    }

    @GetMapping
    public List<ResultObject> getLabResultGET(@RequestParam(name = "order_no") String order_no) {
        logger.info("Entering Lab Result GET Processor: " + order_no);
        return restResultService.getAllResults(order_no);
    }
}
