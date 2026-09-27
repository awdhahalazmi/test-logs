package com.example.test.service;

import com.example.test.client.PaymentClient;
import com.example.test.model.TransferRequest;
import com.example.test.model.TransferResponse;

public class ExceptionService {
    private final PaymentClient paymentClient = new PaymentClient();

    public TransferResponse getDetails(TransferRequest request) {
        try {
            return paymentClient.transfer(request);
        } catch (RuntimeException ex) {
            throw ex;
        }
    }
}
