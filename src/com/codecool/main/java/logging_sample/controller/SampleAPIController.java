package logging_sample.controller;

import logging_sample.logging.LogFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Request;
import spark.Response;

import java.time.LocalDateTime;

import static logging_sample.logging.LogFormatter.FORMAT;

/**
 * Created by dorasztanko on 2017.01.22..
 */
public class SampleAPIController {
    private static final Logger logger = LoggerFactory.getLogger(SampleAPIController.class);

    public String status(Request req, Response res) {
        logger.info(FORMAT.getCustomizedFormatter() + "Status checked.");
        res.status(200);
        return "Server runs perfectly.";
    }

    public String pullTheTrigger(Request req, Response res) {
        logger.info(FORMAT.getCustomizedFormatter() + "Interaction made at {}", LocalDateTime.now());
        res.status(200);
        return "It seems fine. Check out your console!";
    }
}
