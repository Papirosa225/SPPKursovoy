package com.orderManagement.orderManagementApp.dto;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderDataDto {
    private String userId;
    private List<OrderItemDto> orderItemsList;
}
