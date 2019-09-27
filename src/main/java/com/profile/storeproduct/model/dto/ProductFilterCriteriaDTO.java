package com.profile.storeproduct.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class ProductFilterCriteriaDTO {
    private String brand;
    private Integer stock;
    private String reference;
    private String supplier;
    private String name;
    private Double price;
}
