package com.hotelmanagement.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "orders", schema = "hotel_springboot_db", indexes = {
        @Index(name = "chefID", columnList = "chefID"),
        @Index(name = "cashierID", columnList = "cashierID"),
        @Index(name = "waiterID", columnList = "waiterID")
})
public class Order {
    @Id
    @Column(name = "orderID", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "date", nullable = false)
    private Instant date;

    @Size(max = 20)
    @NotNull
    @Column(name = "status", nullable = false, length = 20)
    private String status;

    @Column(name = "netPrice", precision = 8, scale = 2)
    private BigDecimal netPrice;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "waiterID", nullable = false)
    private Waiter waiterID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chefID")
    private Chef chefID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cashierID")
    private Cashier cashierID;

    @Column(name = "deletedAt")
    private Instant deletedAt;

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

    public Waiter getWaiterID() {
        return waiterID;
    }

    public void setWaiterID(Waiter waiterID) {
        this.waiterID = waiterID;
    }

    public Chef getChefID() {
        return chefID;
    }

    public void setChefID(Chef chefID) {
        this.chefID = chefID;
    }

    public Cashier getCashierID() {
        return cashierID;
    }

    public void setCashierID(Cashier cashierID) {
        this.cashierID = cashierID;
    }

    public Instant getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Instant deletedAt) {
        this.deletedAt = deletedAt;
    }

}