package org.springboot.domain;

import org.springframework.data.annotation.Id;

public class Customer {

    @Id
    private String customerId;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
