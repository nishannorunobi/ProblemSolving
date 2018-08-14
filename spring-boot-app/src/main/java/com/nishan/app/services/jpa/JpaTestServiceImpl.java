package com.nishan.app.services.jpa;

import com.nishan.app.dao.jpa.JpaTestDao;
import com.nishan.app.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class JpaTestServiceImpl {
    @Autowired
    private JpaTestDao<User> jpaTestDao;

    @org.springframework.transaction.annotation.Transactional
    public void create_no_tx_success(User user) {
        jpaTestDao.save(user);
    }

    public User get_no_tx_success(Long id) {
        User user = jpaTestDao.get(id, User.class);
        return user;
    }
}
