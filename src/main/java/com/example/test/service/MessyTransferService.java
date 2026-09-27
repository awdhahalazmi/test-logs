package com.example.test.service;

import com.example.test.client.PaymentClient;
import com.example.test.model.TransferRequest;
import com.example.test.model.TransferResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MessyTransferService {

    private static final Logger log =
            LoggerFactory.getLogger(MessyTransferService.class);

    private final PaymentClient paymentClient = new PaymentClient();

    public TransferResponse transfer(TransferRequest request) {

        log.info("Starting transfer");
        log.debug("Transfer method entered");

        log.info("Starting validation");
        validateRequest(request);
        log.info("Validation completed");

        log.debug("Preparing to call payment client");
        log.info("Calling paymentClient transfer");

        TransferResponse response = paymentClient.transfer(request);

        log.info("Payment client returned response");
        log.debug("Preparing response");

        log.info("Completed transfer");

        return response;
    }

    private void validateRequest(TransferRequest request) {

        log.info("Starting validateRequest");
        log.debug("Checking request");

        if (request == null) {
            log.warn("Request is null");
            throw new IllegalArgumentException("Request is required");
        }

        log.info("Request validation successful");
        log.debug("Leaving validateRequest");
    }

    private String formatReference(String reference) {

        log.info("Starting formatReference");
        log.debug("Formatting reference");

        String formatted = reference.trim().toUpperCase();

        log.info("Reference formatted");
        log.info("Completed formatReference");

        return formatted;
    }
}