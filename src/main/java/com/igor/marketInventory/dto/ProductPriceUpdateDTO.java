package com.igor.marketInventory.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;

@Validated
public record ProductPriceUpdateDTO(
        @PositiveOrZero @NotNull BigDecimal price) {
}
