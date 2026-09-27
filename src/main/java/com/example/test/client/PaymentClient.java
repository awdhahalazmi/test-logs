package com.example.test.client;

import com.example.test.model.TransferRequest;
import com.example.test.model.TransferResponse;

public class PaymentClient {

    public TransferResponse transfer(TransferRequest request) {
        return new TransferResponse("SUCCESS");
    }
}