package com.kapil.retry.controller;

import com.kapil.retry.service.HelperService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.text.MessageFormat;

@RestController
public class SampleController {

    private static Logger logger = LoggerFactory.getLogger(SampleController.class);

    @Autowired
    private HelperService helperService;

    @GetMapping("/hello")
    public String getHelloMessage() {
        if (logger.isInfoEnabled()) {
            logger.info(MessageFormat.format(" Invoked endpoint : {0}", ServletUriComponentsBuilder.fromCurrentRequestUri().toUriString()));
        }
        return helperService.getHelloMessage();
    }

    @GetMapping("/hello/again")
    public String getHelloMessageAgain() {
        if (logger.isInfoEnabled()) {
            logger.info(MessageFormat.format(" Invoked endpoint : {0}", ServletUriComponentsBuilder.fromCurrentRequestUri().toUriString()));
        }
        return helperService.getHelloMessageAgain();
    }
}