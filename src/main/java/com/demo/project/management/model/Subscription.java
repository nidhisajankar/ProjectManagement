package com.demo.project.management.model;

import jakarta.persistence.*;

@Entity
@Table(name = "client")
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String emailId;

    public Subscription(long id, String emailId) {
        this.id = id;
        this.emailId = emailId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
