package com.hotelmanagement.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A DTO for the {@link com.hotelmanagement.entity.Order} entity
 */
public class ResourceOrderDTO implements Serializable {
    private Integer id;
    @NotNull
    private Instant date;
    @Size(max = 20)
    @NotNull
    private String status;
    private BigDecimal netPrice;
    @NotNull
    private ResourceWaiterDTO waiter;
    private ResourceChefDTO chef;
    private ResourceCashierDTO cashier;
    private Set<ResourceBillDTO> bills = new LinkedHashSet<>();

    public ResourceOrderDTO() {
    }

    public ResourceOrderDTO(Integer id, Instant date, String status, BigDecimal netPrice, ResourceWaiterDTO waiter, ResourceChefDTO chef, ResourceCashierDTO cashier, Set<ResourceBillDTO> bills) {
        this.id = id;
        this.date = date;
        this.status = status;
        this.netPrice = netPrice;
        this.waiter = waiter;
        this.chef = chef;
        this.cashier = cashier;
        this.bills = bills;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(BigDecimal netPrice) {
        this.netPrice = netPrice;
    }

    public ResourceWaiterDTO getWaiter() {
        return waiter;
    }

    public void setWaiter(ResourceWaiterDTO waiter) {
        this.waiter = waiter;
    }

    public ResourceChefDTO getChef() {
        return chef;
    }

    public void setChef(ResourceChefDTO chef) {
        this.chef = chef;
    }

    public ResourceCashierDTO getCashier() {
        return cashier;
    }

    public void setCashier(ResourceCashierDTO cashier) {
        this.cashier = cashier;
    }

    public Set<ResourceBillDTO> getBills() {
        return bills;
    }

    public void setBills(Set<ResourceBillDTO> bills) {
        this.bills = bills;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResourceOrderDTO entity = (ResourceOrderDTO) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.date, entity.date) &&
                Objects.equals(this.status, entity.status) &&
                Objects.equals(this.netPrice, entity.netPrice) &&
                Objects.equals(this.waiter, entity.waiter) &&
                Objects.equals(this.chef, entity.chef) &&
                Objects.equals(this.cashier, entity.cashier) &&
                Objects.equals(this.bills, entity.bills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, status, netPrice, waiter, chef, cashier, bills);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "date = " + date + ", " +
                "status = " + status + ", " +
                "netPrice = " + netPrice + ", " +
                "waiter = " + waiter + ", " +
                "chef = " + chef + ", " +
                "cashier = " + cashier + ", " +
                "bills = " + bills + ")";
    }
}