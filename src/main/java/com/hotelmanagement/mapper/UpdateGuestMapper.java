package com.hotelmanagement.mapper;

import com.hotelmanagement.domain.UpdateGuestDTO;
import com.hotelmanagement.entity.Guest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UpdateGuestMapper {
    Guest updateGuestDTOToGuest(UpdateGuestDTO updateGuestDTO);

    UpdateGuestDTO guestToUpdateGuestDTO(Guest guest);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Guest updateGuestFromUpdateGuestDTO(UpdateGuestDTO updateGuestDTO, @MappingTarget Guest guest);
}
