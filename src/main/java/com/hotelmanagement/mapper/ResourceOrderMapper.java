package com.hotelmanagement.mapper;

import com.hotelmanagement.domain.ResourceOrderDTO;
import com.hotelmanagement.entity.Order;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ResourceOrderMapper {
    @Mapping(source = "waiter", target = "waiterID")
    @Mapping(source = "chef", target = "chefID")
    @Mapping(source = "cashier", target = "cashierID")
    Order resourceOrderDTOToOrder(ResourceOrderDTO resourceOrderDTO);

    @InheritInverseConfiguration(name = "resourceOrderDTOToOrder")
    ResourceOrderDTO orderToResourceOrderDTO(Order order);

    @InheritConfiguration(name = "resourceOrderDTOToOrder")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Order updateOrderFromResourceOrderDTO(ResourceOrderDTO resourceOrderDTO, @MappingTarget Order order);

    @AfterMapping
    default void linkBills(@MappingTarget Order order) {
        order.getBills().forEach(bill -> bill.setOrderID(order));
    }
}
