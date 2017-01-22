package logging_sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Request;
import spark.Response;

import java.time.LocalDateTime;

/**
 * Created by dorasztanko on 2017.01.22..
 */
public class SampleAPIController {
    private static final Logger logger = LoggerFactory.getLogger(SampleAPIController.class);

    public String status(Request req, Response res) {
        logger.info("Status checked.");
        res.status(200);
        return "Server runs perfectly.";
    }

    public String pullTheTrigger(Request req, Response res) {
        logger.info("Interaction made at {}", LocalDateTime.now());
        res.status(200);
        return "It seems fine. Check out your console!";
    }
}
