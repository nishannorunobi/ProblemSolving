package com.nishan.app.services.jpa;

import com.nishan.app.dao.jpa.JpaTestDao;
import com.nishan.app.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class JpaTestServiceImplV1 {
    @Autowired
    private JpaTestDao<User> jpaTestDao;

    public void save_no_tx_fail(User user) {
        jpaTestDao.save(user);
    }

    public User get_no_tx_success(Long id) {
        User user = jpaTestDao.get(id, User.class);
        return user;
    }

    public User update_no_tx_fail(User user, Long id) {
        User managedUser = jpaTestDao.get(id, User.class);
        managedUser.setName(user.getName());
        jpaTestDao.edit(managedUser);
        return managedUser;
    }
}
