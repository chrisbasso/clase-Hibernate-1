package org.hibernate.tutorial.em;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersonaDAO {

	private EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("org.hibernate.tutorial.jpa");

	public PersonaDAO() {

	}

	public void saveEmpleado(Empleado e) {
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();

		entityManager.persist(e);
		entityManager.getTransaction().commit();
		entityManager.close();

	}
	
	public List<Empleado> getEmpleados() {
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		List<Empleado> result = entityManager.createQuery( "from Empleado", Empleado.class).getResultList();
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
		return result;
	}
	
	public void removerEmpleado(Empleado e) {
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();

		entityManager.remove(e);
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}
	
	public Empleado GetById(int id) {
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();

		Empleado e = entityManager.find(Empleado.class, id );
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
		return e;
		

	}

}
