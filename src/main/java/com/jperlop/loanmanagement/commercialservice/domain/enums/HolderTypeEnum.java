package com.jperlop.loanmanagement.commercialservice.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HolderTypeEnum {
    MAIN("individual"),
    ASSOCIATE("associate");

    private final String value;
}
