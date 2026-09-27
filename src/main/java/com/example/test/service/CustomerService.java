package com.example.test.service;

import com.example.test.model.CustomerRequest;

public class CustomerService {
    public String updateCustomer(CustomerRequest request, String civilId, String token) {
        checkRequest(request);
        return "UPDATED";
    }

    private void checkRequest(CustomerRequest request) {
        if (request == null) {
            throw new IllegalArgumentException("request is required");
        }
    }
}
