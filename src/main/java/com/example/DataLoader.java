package com.example;

import com.example.dao.UserHistoryDao;
import com.example.dao.UserHistoryPkDao;
import com.example.model.UserHistory;
import com.example.model.UserHistoryPK;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DataLoader implements ApplicationRunner{

    @Autowired
    private UserHistoryDao userHistoryDao;
    @Autowired
    private UserHistoryPkDao userHistoryPkDao;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        for (int i = 1; i < 60; i++) {

            UserHistoryPK userPk = new UserHistoryPK();
            userPk.setFromDate(
                    new Date((long) 9e7*i)
            );
            userPk.setToDate(
                    new Date((long) 9e7*2*i)
            );

            UserHistoryPK savedUserPk = userHistoryPkDao.save(userPk);

            UserHistory userHistory = new UserHistory();
            userHistory.setUserHistoryPK(
                    userHistoryPkDao.findOne(
                            savedUserPk.getActualId()
                    )
            );

            userHistoryDao.save(userHistory);
        }
    }
}
