package com.example.test.service;

import org.springframework.stereotype.Service;
import com.example.test.client.PaymentClient;
import com.example.test.model.TransferRequest;
import com.example.test.model.TransferResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class TransferService {

    private static final Logger log = LoggerFactory.getLogger(TransferService.class);

    private final PaymentClient paymentClient = new PaymentClient();

    public TransferResponse transfer(TransferRequest request) {
        log.info("Starting transfer");
        validateRequest(request);
        log.info("Calling paymentClient transfer");
        TransferResponse response = paymentClient.transfer(request);
        log.info("Completed transfer");
        return response;
    }

    private void validateRequest(TransferRequest request) {
        log.info("Starting validateRequest");
        if (request == null) {
            throw new IllegalArgumentException("Request is required");
        }
    }
}
