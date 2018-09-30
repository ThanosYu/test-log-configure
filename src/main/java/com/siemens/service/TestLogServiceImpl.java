package com.siemens.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author Thanos Yu
 * @date 9/28/2018 2:06 PM
 */
@Service
public class TestLogServiceImpl implements TestLogService {

    private Logger log = LoggerFactory.getLogger(TestLogServiceImpl.class);

    @Override
    public void pringLog() {
        log.debug("--------------------------------------debug: ");
        log.info("--------------------------------------info: ");
        log.error("--------------------------------------error: ");
    }
}