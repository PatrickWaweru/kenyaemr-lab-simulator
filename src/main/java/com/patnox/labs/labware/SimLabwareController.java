package com.patnox.labs.labware;

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
@RequestMapping(path = "api/v1/labware")
public class SimLabwareController {
    private static Logger logger = LoggerFactory.getLogger(SimLabwareController.class);
    private RestLabwarePullEIDService restLabwarePullEIDService;
    private RestLabwarePullVLService restLabwarePullVLService;

    @Autowired
    public SimLabwareController(RestLabwarePullEIDService restLabwarePullEIDService, RestLabwarePullVLService restLabwarePullVLService) {
        this.restLabwarePullEIDService = restLabwarePullEIDService;
        this.restLabwarePullVLService = restLabwarePullVLService;
    }

    // EID

    @PostMapping("eid/push")
    public void getEIDLabResultPOST(@RequestBody String query){
        logger.info("Entering Labware EID Lab Result PUSH Processor: " + query);
    }

    @GetMapping("eid/pull")
    public List<LabwareVLResultObject> getEIDLabResultGET(@RequestParam(name = "order_no") String order_no) {
        logger.info("Entering Labware EID Lab Result PULL Processor: " + order_no);
        return restLabwarePullEIDService.getAllResults(order_no);
    }

    // VL

    @PostMapping("vl/push")
    public void getVLLabResultPOST(@RequestBody String query){
        logger.info("Entering Labware VL Lab Result PUSH Processor: " + query);
    }

    @GetMapping("vl/pull")
    public List<LabwareVLResultObject> getVLLabResultGET(@RequestParam(name = "order_no") String order_no) {
        logger.info("Entering Labware VL Lab Result PULL Processor: " + order_no);
        return restLabwarePullVLService.getAllResults(order_no);
    }
}
