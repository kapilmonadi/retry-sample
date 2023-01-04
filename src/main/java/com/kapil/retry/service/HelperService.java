package com.kapil.retry.service;

import com.kapil.retry.exception.MyCustomException;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;

public interface HelperService {

    String getHelloMessage();

    @Retryable(retryFor = {MyCustomException.class},
            maxAttempts = 3,
            backoff = @Backoff(delay = 1000))
    String getHelloMessageAgain();

    // recovery method
    @Recover
    String getDefaultMessage();
}
