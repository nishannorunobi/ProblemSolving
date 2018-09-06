package com.nishan.app.services.jpa;

import com.nishan.app.dao.jpa.JpaTestDao;
import com.nishan.app.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class JpaTestServiceImplV2 {
    @Autowired
    private JpaTestDao<User> jpaTestDao;

    public void save_my_method_tx(User user) {
        save_with_tx(user);
    }

    @Transactional
    public void save_with_tx(User user) {
        jpaTestDao.save(user);
    }

    public void update_my_method_tx(User user,Long id) {
        User findUser = jpaTestDao.get(id,User.class);
        findUser.setName(user.getName());
        //update_with_tx(findUser);
        find_and_update_with_tx(user,id);
    }

    @Transactional
    public void update_with_tx(User user) {
        jpaTestDao.edit(user);
    }

    @Transactional
    public void find_and_update_with_tx(User user,Long id) {
        User findUser = jpaTestDao.get(id,User.class);
        findUser.setName(user.getName());
        jpaTestDao.edit(findUser);
    }

}
