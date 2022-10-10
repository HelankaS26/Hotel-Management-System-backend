package com.hotelmanagement.mapper;

import com.hotelmanagement.domain.StoreBillDTO;
import com.hotelmanagement.entity.Bill;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface StoreBillMapper {
    @Mapping(source = "billOrderID", target = "id.orderID")
    @Mapping(source = "billItemID", target = "id.itemID")
    Bill storeBillDTOToBill(StoreBillDTO storeBillDTO);

    @InheritInverseConfiguration(name = "storeBillDTOToBill")
    StoreBillDTO billToStoreBillDTO(Bill bill);

    @InheritConfiguration(name = "storeBillDTOToBill")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Bill updateBillFromStoreBillDTO(StoreBillDTO storeBillDTO, @MappingTarget Bill bill);
}
