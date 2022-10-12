package com.hotelmanagement.entity;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "userloginrecords", schema = "hotel_springboot_db")
public class Userloginrecord {
    @EmbeddedId
    private UserloginrecordId id;

    @MapsId("userID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userID", nullable = false)
    private User userID;

    @Column(name = "logoutTime")
    private LocalTime logoutTime;

    public UserloginrecordId getId() {
        return id;
    }

    public void setId(UserloginrecordId id) {
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