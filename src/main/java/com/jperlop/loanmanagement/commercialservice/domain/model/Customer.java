package com.jperlop.loanmanagement.commercialservice.domain.model;

import lombok.Data;

import java.util.List;

@Data
public class Customer {

    private String name;
    private String lastName;
    private int age;
    private String idNumber;
    private Address address;
    private List<Account> accounts;
    private List<RealStateAsset> realStateAssets;
    private List<Loan> loans;
    private Documentation documentation;
    private EmploymentInfo employmentInfo;
}
