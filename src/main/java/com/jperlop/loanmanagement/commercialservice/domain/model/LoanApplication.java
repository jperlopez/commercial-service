package com.jperlop.loanmanagement.commercialservice.domain.model;

import com.jperlop.loanmanagement.commercialservice.domain.enums.LoanStatusEnum;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class LoanApplication {

    private LoanStatusEnum status;
    private Customer customer;
    private LocalDateTime creationDate;
    private LocalDateTime modificationDate;
    private LocalDateTime closingDate;



}
