package com.delivery.model.transportOrder;

import com.delivery.entity.PickupAddressEntity;
import com.delivery.entity.TransportOrderDetailEntity;
import com.delivery.entity.UserEntity;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
@Data
@Builder
public class TransportOrder {
    private Long id;

    private String orderNumber;
    private LocalDateTime orderDate;
    private String status;
    private Double totalAmount;
    private PickupAddressEntity pickupAddress;

    private UserEntity shipper;
    private Boolean paymentStatus;

    private List<TransportOrderDetailEntity> transportOrderDetailList;

    private LocalDateTime deliveryDate;
    private String note;
}
