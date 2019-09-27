package com.profile.storeproduct.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "Product")
public class ProductVO {
    @Id
    String id;
    int stock;
    String name;
    String brand;
    Date modifiedDate;
    @DecimalMin("0.0")
    double price;
    @Indexed(unique = true)
    String reference;
    String supplier;
    boolean active=true;
}
