package com.nyo.appily.DAO;

import com.nyo.appily.Models.ChoresEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class ChoresDAO {

    @PersistenceContext
    private EntityManager entityMan;

    public long insert(ChoresEntity c){
        entityMan.persist(c);
        return c.getChoreId();
    }
}
