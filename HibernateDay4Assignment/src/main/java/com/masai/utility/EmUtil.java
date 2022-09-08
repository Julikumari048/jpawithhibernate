package com.masai.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmUtil {
	
	private static EntityManagerFactory entityManagerFactory;
	
	
	static {
		
		entityManagerFactory = Persistence.createEntityManagerFactory("empUnit");
		
	}
	
	public static EntityManager providEntityManager() {
		return entityManagerFactory.createEntityManager();
	}

}
