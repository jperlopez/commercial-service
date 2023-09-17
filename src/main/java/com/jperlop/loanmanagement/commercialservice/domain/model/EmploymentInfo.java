package com.jperlop.loanmanagement.commercialservice.domain.model;

import lombok.Data;

@Data
public class EmploymentInfo {

    private boolean isOngoingContract;
    private boolean isPublicEmployee;
    private int seniorityInMonths;
    private Employer employer;
    private String netMonthlySalary;

}
