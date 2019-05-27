package com.siemens.controller;

import com.siemens.service.TestLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Thanos Yu
 * @date 9/28/2018 1:56 PM
 */
@RestController
@RequestMapping("/log")
public class TestLogController {
    @Autowired
    private TestLogService testLogService;

    private Logger log = LoggerFactory.getLogger(TestLogController.class);

    @RequestMapping(value = "/print")
    public String updateLogLevel() throws Exception {

        log.debug("--------------------------------------debug: ");
        log.info("--------------------------------------info: ");
        log.warn("--------------------------------------warn: ");
        log.error("--------------------------------------error: ");
        testLogService.pringLog();
        return "success";
    }
}