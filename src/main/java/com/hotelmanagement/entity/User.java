package com.hotelmanagement.entity;

import org.hibernate.Hibernate;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "users", indexes = {
        @Index(name = "employeeID", columnList = "employeeID"),
        @Index(name = "username", columnList = "username", unique = true)
})
public class User {
    @Id
    @Size(max = 8)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userID", nullable = false, length = 8)
    private String id;

    @Size(max = 30)
    @NotNull
    @Column(name = "username", nullable = false, length = 30)
    private String username;

    @Size(max = 100)
    @NotNull
    @Column(name = "password", nullable = false, length = 100)
    private String password;

    @Size(max = 10)
    @NotNull
    @Column(name = "status", nullable = false, length = 10)
    private String status;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "employeeID", nullable = false)
    private Employee employeeID;

    @Column(name = "deleted_at")
    private Instant deletedAt;

    @OneToMany(mappedBy = "user")
    private Set<UserLoginRecord> userLoginRecords = new LinkedHashSet<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Employee getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Employee employeeID) {
        this.employeeID = employeeID;
    }

    public Instant getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Instant deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Set<UserLoginRecord> getUserLoginRecords() {
        return userLoginRecords;
    }

    public void setUserLoginRecords(Set<UserLoginRecord> userLoginRecords) {
        this.userLoginRecords = userLoginRecords;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return id != null && Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "username = " + username + ", " +
                "status = " + status + ", " +
                "deletedAt = " + deletedAt + ")";
    }
}