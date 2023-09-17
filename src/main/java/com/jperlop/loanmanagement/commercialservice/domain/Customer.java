package com.jperlop.loanmanagement.commercialservice.domain;

import lombok.Data;

@Data
public class Customer {

    private String name;
    private String lastName;
    private int age;
    private Address address;
    private Account account;
    private Documentation documentation;
}
