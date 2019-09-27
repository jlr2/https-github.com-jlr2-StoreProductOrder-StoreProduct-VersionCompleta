package com.profile.storeproduct.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StockDTO {
    int stock;
    String reference;
}
