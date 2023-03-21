package com.legacytechie.productservice.dto.request;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ProductRequest {

    //private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
