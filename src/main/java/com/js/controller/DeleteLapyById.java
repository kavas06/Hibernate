package com.js.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.js.dto.Laptop;


public class DeleteLapyById {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("kavan");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et =em.getTransaction();
		Laptop l=em.find(Laptop.class,5);
		if(l!=null) {
			
		
			et.begin();
			em.remove(l);
			et.commit();
		}else {
			System.out.println("NO LAP WITH GIVEN ID");
	}
}
}

