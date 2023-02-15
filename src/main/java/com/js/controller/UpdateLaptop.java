package com.js.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.js.dto.Laptop;


public class UpdateLaptop {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("kavan");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Laptop l=em.find(Laptop.class,5);
		if(l!=null) {
			l.setPrice(175999.0);
			l.setBrand("MAC");
			l.setProcessor("macos");
			l.setRam_gb(64);
			
			et.begin();
			em.merge(l);
			et.commit();
			
		}else {
			System.out.println("No LAPTOP To Update");
		}
			
			}

		}
