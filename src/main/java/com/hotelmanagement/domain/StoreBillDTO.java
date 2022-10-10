package com.hotelmanagement.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * A DTO for the {@link com.hotelmanagement.entity.Bill} entity
 */
public class StoreBillDTO implements Serializable {
    @NotNull
    private Integer billOrderID;
    @Size(max = 8)
    @NotNull
    private String billItemID;
    @NotNull
    private BigDecimal unitPrice;
    @NotNull
    private Integer quantity;

    public StoreBillDTO() {
    }

    public StoreBillDTO(Integer billOrderID, String billItemID, BigDecimal unitPrice, Integer quantity) {
        this.billOrderID = billOrderID;
        this.billItemID = billItemID;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public Integer getBillOrderID() {
        return billOrderID;
    }

    public void setBillOrderID(Integer billOrderID) {
        this.billOrderID = billOrderID;
    }

    public String getBillItemID() {
        return billItemID;
    }

    public void setBillItemID(String billItemID) {
        this.billItemID = billItemID;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StoreBillDTO entity = (StoreBillDTO) o;
        return Objects.equals(this.billOrderID, entity.billOrderID) &&
                Objects.equals(this.billItemID, entity.billItemID) &&
                Objects.equals(this.unitPrice, entity.unitPrice) &&
                Objects.equals(this.quantity, entity.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billOrderID, billItemID, unitPrice, quantity);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "billOrderID = " + billOrderID + ", " +
                "billItemID = " + billItemID + ", " +
                "unitPrice = " + unitPrice + ", " +
                "quantity = " + quantity + ")";
    }
}