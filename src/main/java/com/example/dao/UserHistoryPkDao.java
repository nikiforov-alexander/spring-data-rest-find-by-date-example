package com.example.dao;

import com.example.model.UserHistoryPK;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserHistoryPkDao extends
        PagingAndSortingRepository<UserHistoryPK, Long> {
}
