package com.kapil.retry.controller;

import com.kapil.retry.service.HelperService;
import com.kapil.retry.service.impl.HelperServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class SampleController {

    private static Logger logger = LoggerFactory.getLogger(HelperServiceImpl.class);

    @Autowired
    private HelperService helperService;
    @GetMapping("/hello")
    public String getHelloMessage() {
        logger.info(" Invoked endpoint : " + ServletUriComponentsBuilder.fromCurrentRequestUri().toUriString());
        return helperService.getHelloMessage();
    }

    @GetMapping("/hello/again")
    public String getHelloMessageAgain() {
        logger.info(" Invoked endpoint : " + ServletUriComponentsBuilder.fromCurrentRequestUri().toUriString());
        return helperService.getHelloMessageAgain();
    }
}