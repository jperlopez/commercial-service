package com.jperlop.loanmanagement.commercialservice.domain.model;

import lombok.Data;

@Data
public class Documentation {

    private byte[] bankStatements;
    private byte[] realStateDocuments;
    private byte[] idCard;

}
