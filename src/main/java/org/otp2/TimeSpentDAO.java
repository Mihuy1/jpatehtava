package org.otp2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TimeSpentDAO {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("examplePU");

    public void addTimeSpent(TimeSpent timeSpent) {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(timeSpent);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public TimeSpent findTimeSpent(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(TimeSpent.class, id);
        } finally {
            em.close();
        }
    }

    public void updateTimeSpent(TimeSpent timeSpent) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(timeSpent);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
