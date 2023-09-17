package com.jperlop.loanmanagement.commercialservice.domain.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Loan {

    private String holderName;
    private String bankName;
    private boolean isSoleDebtor;
    private BigDecimal totalAmount;
    private BigDecimal remainingAmount;
    private BigDecimal unpaidAmount;
    private int totalLife;
    private int remainingLife;
}
