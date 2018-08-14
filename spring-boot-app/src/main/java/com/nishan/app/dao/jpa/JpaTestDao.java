package com.nishan.app.dao.jpa;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class JpaTestDao<T> {
    @PersistenceContext
    EntityManager entityManager;

    public void save(T t){
        entityManager.persist(t);
    }

    public T get(Long id,Class<T> classtype){
        return entityManager.find(classtype,id);
    }
}
