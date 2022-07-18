package com.patnox.labs.chai;

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
@RequestMapping(path = "api/v1/chai")
public class SimChaiController {
    private static Logger logger = LoggerFactory.getLogger(SimChaiController.class);
    private RestChaiPullEIDService restChaiPullEIDService;
    private RestChaiPullVLService restChaiPullVLService;

    @Autowired
    public SimChaiController(RestChaiPullEIDService restChaiPullEIDService, RestChaiPullVLService restChaiPullVLService) {
        this.restChaiPullEIDService = restChaiPullEIDService;
        this.restChaiPullVLService = restChaiPullVLService;
    }

    // EID
    @PostMapping("eid/push")
    public void getEIDLabResultPOST(@RequestBody String query){
        logger.info("Entering Chai EID Lab Request PUSH Processor: " + query);
    }

    @GetMapping("eid/pull")
    public RestChaiPullEIDService.returnObject getEIDLabRequestGET(@RequestParam(name = "order_numbers") String order_numbers) {
        logger.info("Entering Chai EID Lab Request PULL Processor: " + order_numbers);
        return restChaiPullEIDService.getAllResults(order_numbers);
    }

    @PostMapping("eid/pull")
    public RestChaiPullEIDService.returnObject getEIDLabRequestPost(@RequestParam(name = "order_numbers") String order_numbers) {
        logger.info("Entering Chai EID Lab Request PULL Processor: " + order_numbers);
        return restChaiPullEIDService.getAllResults(order_numbers);
    }

    //VL
    @PostMapping("vl/push")
    public void getVLLabResultPOST(@RequestBody String query){
        logger.info("Entering Chai VL Lab Request PUSH Processor: " + query);
    }

    @GetMapping("vl/pull")
    public RestChaiPullVLService.returnObject getVLLabRequestGET(@RequestParam(name = "order_numbers") String order_numbers) {
        logger.info("Entering Chai VL Lab Request PULL Processor: " + order_numbers);
        return restChaiPullVLService.getAllResults(order_numbers);
    }

    @PostMapping("vl/pull")
    public RestChaiPullVLService.returnObject getVLLabRequestPost(@RequestParam(name = "order_numbers") String order_numbers) {
        logger.info("Entering Chai VL Lab Request PULL Processor: " + order_numbers);
        return restChaiPullVLService.getAllResults(order_numbers);
    }
}
