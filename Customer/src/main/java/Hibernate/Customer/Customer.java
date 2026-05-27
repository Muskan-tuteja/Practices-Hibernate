package Hibernate.Customer;

import java.util.List;



import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Customer {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("SELECT s FROM Customer1 s");
		
		List<Customer1> l = q.getResultList();
		for(Customer1 c:l) {
			System.out.println(c.getId()+"/n " + c.getEmail() + "/n" + c.getName() + "/n" + c.getMarks());
		}
		
	}

}
