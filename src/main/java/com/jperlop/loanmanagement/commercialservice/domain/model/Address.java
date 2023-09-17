package com.jperlop.loanmanagement.commercialservice.domain.model;

import lombok.Data;

@Data
public class Address {

    private String city;
    private String state;
    private String country;
    private String postalCode;
    private String phoneNumber;
}
