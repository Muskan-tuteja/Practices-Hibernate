package org.example;

import jakarta.persistence.EntityManager;

public class JPADemoMain {
    public static void main(String[] args) {
        EntityManager em= JPAUtil.getEntityManager();

        try{
            UserClassHibernate user = new UserClassHibernate("Muskan");
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
            System.out.println("Successfully persisted user : " + user.getId());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            em.close();
            JPAUtil.close();
        }
    }
}
