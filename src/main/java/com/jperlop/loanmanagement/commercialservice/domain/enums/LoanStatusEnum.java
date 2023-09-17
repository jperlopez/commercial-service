package com.jperlop.loanmanagement.commercialservice.domain.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum LoanStatusEnum {

    APPROVED("Approved"),
    PENDING_DOCUMENTATION("Pending documentation"),
    RISK_ASSESMENT("In risk assesment"),
    PENDING_APPROVAL("Pending approval"),
    CANCELLED_BY_CUSTOMER("Cancelled by customer"),
    DENIED("Denied");

    private final String value;
}
