package com.hotelmanagement.entity;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "userloginrecords", schema = "hotel_springboot_db")
public class UserLoginRecord {
    @EmbeddedId
    private UserLoginRecordId id;

    @MapsId("userID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userID", nullable = false)
    private User userID;

    @Column(name = "logoutTime")
    private LocalTime logoutTime;

    public UserLoginRecordId getId() {
        return id;
    }

    public void setId(UserLoginRecordId id) {
        this.id = id;
    }

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }

    public LocalTime getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(LocalTime logoutTime) {
        this.logoutTime = logoutTime;
    }

}