package com.delivery.model.rawDataFromEcommerce;

import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ItemTransport {
    private Long id;
    private String productName;
    private Integer quantity;
    private Double unitPrice;
}
