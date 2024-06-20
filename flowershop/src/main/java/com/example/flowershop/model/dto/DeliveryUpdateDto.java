package com.example.flowershop.model.dto;

import com.example.flowershop.model.Delivery;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class DeliveryUpdateDto {
    private Integer id;
    @Length(min = 15)
    @NotNull
    private String address;
    @NotNull
    private LocalDateTime date;
    private boolean confirmed;
    private String customerId;
    private List<Integer> productIds;

    public Delivery toObject(DeliveryUpdateDto deliveryDto) {
        Delivery delivery = new Delivery();
        delivery.setId(deliveryDto.getId());
        delivery.setAddress(deliveryDto.getAddress());
        delivery.setDate(deliveryDto.getDate());
        delivery.setConfirmed(deliveryDto.isConfirmed());
        return delivery;
    }

    public static DeliveryUpdateDto toDto(Delivery delivery) {
        DeliveryUpdateDto deliveryDto = new DeliveryUpdateDto();
        deliveryDto.setAddress(delivery.getAddress());
        deliveryDto.setConfirmed(delivery.isConfirmed());
        deliveryDto.setDate(delivery.getDate());
        deliveryDto.setId(delivery.getId());
        deliveryDto.setCustomerId(deliveryDto.getCustomerId());
        return deliveryDto;
    }


}