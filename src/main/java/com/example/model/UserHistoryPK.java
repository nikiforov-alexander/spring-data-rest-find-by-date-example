package com.example.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class UserHistoryPK {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long actualId;

    // IMPORTANT: we use @Temporal, so that our Date will
    // be saved in SQL table as "1970-01-02", i.e.
    // milliseconds will be ignored
    @Temporal(TemporalType.DATE)
    private Date fromDate;

    @Temporal(TemporalType.DATE)
    private Date toDate;


    // getters and setters

    public Long getActualId() {
        return actualId;
    }

    public void setActualId(Long actualId) {
        this.actualId = actualId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
