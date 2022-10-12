package com.hotelmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "employees", schema = "hotel_springboot_db")
public class Employee {
    @Id
    @Size(max = 8)
    @Column(name = "employeeID", nullable = false, length = 8)
    private String id;

    @Size(max = 20)
    @NotNull
    @Column(name = "employeeType", nullable = false, length = 20)
    private String employeeType;

    @Size(max = 5)
    @NotNull
    @Column(name = "title", nullable = false, length = 5)
    private String title;

    @Size(max = 12)
    @NotNull
    @Column(name = "nic", nullable = false, length = 12)
    private String nic;

    @Size(max = 50)
    @NotNull
    @Column(name = "firstName", nullable = false, length = 50)
    private String firstName;

    @Size(max = 50)
    @Column(name = "lastName", length = 50)
    private String lastName;

    @NotNull
    @Column(name = "dob", nullable = false)
    private LocalDate dob;

    @Size(max = 6)
    @NotNull
    @Column(name = "sex", nullable = false, length = 6)
    private String sex;

    @Size(max = 10)
    @NotNull
    @Column(name = "telNo", nullable = false, length = 10)
    private String telNo;

    @Size(max = 150)
    @NotNull
    @Column(name = "address", nullable = false, length = 150)
    private String address;

    @Size(max = 50)
    @Column(name = "email", length = 50)
    private String email;

    @NotNull
    @Column(name = "basicSalary", nullable = false, precision = 8, scale = 2)
    private BigDecimal basicSalary;

    @Size(max = 10)
    @NotNull
    @Column(name = "status", nullable = false, length = 10)
    private String status;

    @Column(name = "joinedDate")
    private LocalDate joinedDate;

    @Column(name = "deletedAt")
    private Instant deletedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(BigDecimal basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(LocalDate joinedDate) {
        this.joinedDate = joinedDate;
    }

    public Instant getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Instant deletedAt) {
        this.deletedAt = deletedAt;
    }

}