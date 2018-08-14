package com.nishan.app.dao.jpa;

import com.nishan.app.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryTestDao extends JpaRepository<User, Long> {
}
