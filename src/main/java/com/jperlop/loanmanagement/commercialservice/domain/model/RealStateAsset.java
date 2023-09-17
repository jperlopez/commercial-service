package com.jperlop.loanmanagement.commercialservice.domain.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RealStateAsset {

    private boolean hasEncumbrances;
    private boolean isSoleOwnership;
    private BigDecimal marketPrize;
    private BigDecimal assessedValue;
    private int numberOfOwners;
}
