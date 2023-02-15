package com.js.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.js.dto.Laptop;

public class LaptopCRUD {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("kavan");
	private Laptop newLaptop;

	public boolean insert(Laptop l) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.persist(l);
		et.commit();
		Laptop res = em.find(Laptop.class, l.getId());
		if (res != null) {
			return true;

		} else {
			return false;

		}
	}

	public Laptop getLaptopById(int id) {
		EntityManager em = emf.createEntityManager();
		return em.find(Laptop.class, id);
	}

	public boolean updateLaptop(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Laptop la = em.find(Laptop.class, id);
		if (la != null) {
			newLaptop.setId(la.getId());
			et.begin();
			em.merge(newLaptop);
			et.commit();
			return true;

		} else {
			return false;
		}
	}

	public boolean deleteLaptop(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Laptop la = em.find(Laptop.class, id);
		if (la != null) {
			newLaptop.setId(la.getId());
			et.begin();
			em.merge(newLaptop);
			et.commit();
			return true;
		} else {
			return false;
		}

	}

	public List<Laptop> getAllLaptops() {
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select lc from Laptop lc");
		return q.getResultList();

	}
}
