package org.example;

import org.hibernate.Session;

public class HibernateDemoMain {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSession();

        try {
            UserClassHibernate user = new UserClassHibernate();
            user.setName("Mahi");
        session.beginTransaction();
        session.persist(user);
        session.getTransaction().commit();
            session.close();
            System.out.println("User Saved : " + user.getId());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            HibernateUtil.close();
        }
    }
}
