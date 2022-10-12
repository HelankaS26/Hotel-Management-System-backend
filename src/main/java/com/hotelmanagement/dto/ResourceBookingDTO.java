package com.hotelmanagement.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A DTO for the {@link com.hotelmanagement.entity.Booking} entity
 */
public class ResourceBookingDTO implements Serializable {
    private Integer id;
    @NotNull
    private ResourceGuestDTO guest;
    @NotNull
    private LocalDate dateFrom;
    @NotNull
    private LocalDate dateTo;
    @Size(max = 9)
    @NotNull
    private String status;
    private BigDecimal billingAmount;
    @NotNull
    private Integer noOfPerson;
    private Instant checkIn;
    private Instant checkOut;
    @NotNull
    private ResourceReceptionistDTO receptionist;
    private Set<ResourceReservationDTO> reservations = new LinkedHashSet<>();

    public ResourceBookingDTO() {
    }

    public ResourceBookingDTO(Integer id, ResourceGuestDTO guest, LocalDate dateFrom, LocalDate dateTo, String status, BigDecimal billingAmount, Integer noOfPerson, Instant checkIn, Instant checkOut, ResourceReceptionistDTO receptionist, Set<ResourceReservationDTO> reservations) {
        this.id = id;
        this.guest = guest;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.status = status;
        this.billingAmount = billingAmount;
        this.noOfPerson = noOfPerson;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.receptionist = receptionist;
        this.reservations = reservations;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ResourceGuestDTO getGuest() {
        return guest;
    }

    public void setGuest(ResourceGuestDTO guest) {
        this.guest = guest;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getBillingAmount() {
        return billingAmount;
    }

    public void setBillingAmount(BigDecimal billingAmount) {
        this.billingAmount = billingAmount;
    }

    public Integer getNoOfPerson() {
        return noOfPerson;
    }

    public void setNoOfPerson(Integer noOfPerson) {
        this.noOfPerson = noOfPerson;
    }

    public Instant getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Instant checkIn) {
        this.checkIn = checkIn;
    }

    public Instant getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Instant checkOut) {
        this.checkOut = checkOut;
    }

    public ResourceReceptionistDTO getReceptionist() {
        return receptionist;
    }

    public void setReceptionist(ResourceReceptionistDTO receptionist) {
        this.receptionist = receptionist;
    }

    public Set<ResourceReservationDTO> getReservations() {
        return reservations;
    }

    public void setReservations(Set<ResourceReservationDTO> reservations) {
        this.reservations = reservations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResourceBookingDTO entity = (ResourceBookingDTO) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.guest, entity.guest) &&
                Objects.equals(this.dateFrom, entity.dateFrom) &&
                Objects.equals(this.dateTo, entity.dateTo) &&
                Objects.equals(this.status, entity.status) &&
                Objects.equals(this.billingAmount, entity.billingAmount) &&
                Objects.equals(this.noOfPerson, entity.noOfPerson) &&
                Objects.equals(this.checkIn, entity.checkIn) &&
                Objects.equals(this.checkOut, entity.checkOut) &&
                Objects.equals(this.receptionist, entity.receptionist) &&
                Objects.equals(this.reservations, entity.reservations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, guest, dateFrom, dateTo, status, billingAmount, noOfPerson, checkIn, checkOut, receptionist, reservations);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "guest = " + guest + ", " +
                "dateFrom = " + dateFrom + ", " +
                "dateTo = " + dateTo + ", " +
                "status = " + status + ", " +
                "billingAmount = " + billingAmount + ", " +
                "noOfPerson = " + noOfPerson + ", " +
                "checkIn = " + checkIn + ", " +
                "checkOut = " + checkOut + ", " +
                "receptionist = " + receptionist + ", " +
                "reservations = " + reservations + ")";
    }
}