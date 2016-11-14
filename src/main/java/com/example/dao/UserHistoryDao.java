package com.example.dao;

import com.example.model.UserHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface UserHistoryDao extends
        PagingAndSortingRepository<UserHistory, Long> {

    Page<UserHistory> findByUserHistoryPK_FromDateLessThanEqualAndUserHistoryPK_ToDateGreaterThanEqual(
            @DateTimeFormat(pattern = "yyyy-MM-dd") @Param("from") Date from,
            @DateTimeFormat(pattern = "yyyy-MM-dd") @Param("to") Date to,
            Pageable pageable
    );

}
