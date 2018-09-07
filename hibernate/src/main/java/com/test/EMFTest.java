package com.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class EMFTest {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("NewPersistenceUnit");
        EntityManager entityManager = factory.createEntityManager();
        Query userQuery = entityManager.createQuery("from StudentEntity ");//JPQL -> HQL
        List resultList = userQuery.getResultList();
        System.out.println(resultList);
        factory.close();
    }
}
