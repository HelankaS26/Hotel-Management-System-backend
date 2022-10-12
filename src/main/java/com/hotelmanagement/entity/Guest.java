package com.hotelmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;

@Entity
@Table(name = "guests", schema = "hotel_springboot_db")
public class Guest {
    @Id
    @Size(max = 10)
    @Column(name = "telNo", nullable = false, length = 10)
    private String id;

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

    @Size(max = 6)
    @NotNull
    @Column(name = "sex", nullable = false, length = 6)
    private String sex;

    @Size(max = 150)
    @NotNull
    @Column(name = "address", nullable = false, length = 150)
    private String address;

    @Size(max = 50)
    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "deletedAt")
    private Instant deletedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public Instant getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Instant deletedAt) {
        this.deletedAt = deletedAt;
    }

}