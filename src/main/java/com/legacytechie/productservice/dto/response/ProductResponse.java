package com.legacytechie.productservice.dto.response;


import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ProductResponse {

    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
