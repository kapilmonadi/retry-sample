package com.kapil.retry.service.impl;

import com.kapil.retry.exception.MyCustomException;
import com.kapil.retry.service.HelperService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class HelperServiceImpl implements HelperService {

    private static Logger logger = LoggerFactory.getLogger(HelperServiceImpl.class);

    @Override
    public String getHelloMessage() {
        return "Hello there !! ";
    }

    @Override
    public String getHelloMessageAgain() {
        logger.info(" Inside getHelloMessageAgain !");
        return getHelloMessageFromDB();
    }

    private String getHelloMessageFromDB() {
        throw new MyCustomException();
    }

    @Override
    public String getDefaultMessage() {
        logger.error("Showing Default Message due to underlying failure !");
        return "Showing Default Message due to underlying failure : " + getHelloMessage();
    }
}
