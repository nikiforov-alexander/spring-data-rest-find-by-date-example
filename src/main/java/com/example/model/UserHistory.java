package com.example.model;

import javax.persistence.*;

@Entity
public class UserHistory {

    // fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn
    private UserHistoryPK userHistoryPK;

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserHistoryPK getUserHistoryPK() {
        return userHistoryPK;
    }

    public void setUserHistoryPK(UserHistoryPK userHistoryPK) {
        this.userHistoryPK = userHistoryPK;
    }
}
