package com.igor.marketInventory.dto.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;
import java.time.LocalDate;

@Validated
public record ProductCreationDTO(@NotBlank String productName,
                                 @NotNull LocalDate expirationDate,
                                 @PositiveOrZero @NotNull BigDecimal price) {
}
