package logging_sample;

import logging_sample.controller.SampleAPIController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static spark.Spark.exception;
import static spark.Spark.get;
import static spark.Spark.port;

/**
 * Created by dorasztanko on 2017.01.22..
 */
public class Server {
    private static final Logger logger = LoggerFactory.getLogger(Server.class);
    private static final Integer portNum = 60000;

    private SampleAPIController controller;

    public static void main(String[] args) {
        port(portNum);
        logger.debug("Server started to run on port: {}", portNum);

        Server app = new Server();
        app.controller = new SampleAPIController();

        // --- ENDPOINTS ---
        get("/", app.controller::status);
        get("/interaction", app.controller::pullTheTrigger);

        // --- EXCEPTION HANDLING ---
        exception(Exception.class, (exception, request, response) -> {
            response.status(500);
            response.body(String.format("Unexpected error occurred: %s", exception.getMessage()));
        });
    }
}
