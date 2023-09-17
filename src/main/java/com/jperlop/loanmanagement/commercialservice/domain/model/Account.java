package com.jperlop.loanmanagement.commercialservice.domain.model;

import com.jperlop.loanmanagement.commercialservice.domain.enums.HolderTypeEnum;

import java.math.BigDecimal;

public class Account {

    private String holderName;
    private HolderTypeEnum accountHolderType;
    private boolean isJointAccount;
    private int numberOfMainHolders;
    private String accountNumber;
    private String country;
    private String bankName;
    private String currency;
    private BigDecimal balance;
}
