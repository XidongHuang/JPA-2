package com.tony.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.tony.jpa.spring.entities.Person;

@Repository
public class PersonDao {

	//How to gain the EntityManger object that connected with current transaction
	//Use @PersistenceCOntext
	@PersistenceContext
	private EntityManager entityManger;
	
	public void save(Person person) {
		entityManger.persist(person);
		
	}
	
}
