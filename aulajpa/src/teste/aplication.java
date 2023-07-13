package teste;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Pessoa;

public class aplication {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa (1, "Pedro Reis", "perdro@gmail.com");
		Pessoa p2 = new Pessoa(2, "Moises Alves","Alves@hotmail.com");
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.getTransaction().commit();
		System.out.println("ok");
	}
}
