package com.springapp.model;

import com.springapp.domain.Spitter;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Iterator;
import java.util.List;

/**
 * Created by dan on 2017/1/17.
 */
@Repository
public class JpaRepositoryImpl implements JpaRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public Spitter findOne(long id) {
        return entityManager.find(Spitter.class, id);
    }
    public void test(){
        System.out.println(entityManager.getProperties());
    }
    public void findByUsername(String username) {
        Query query = entityManager.createQuery("select s from Spitter s where s. username='" + username + "'");
        Spitter result = (Spitter) query.getSingleResult();
        System.out.println(result.getFullName());
        //return (Spitter) entityManager.createQuery("select s from Spitter s where s.username=?").setParameter(1, username).getSingleResult();
    }
}
