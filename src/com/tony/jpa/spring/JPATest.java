package com.tony.jpa.spring;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tony.jpa.service.PersonService;
import com.tony.jpa.spring.entities.Person;

public class JPATest {

	private ApplicationContext ctx = null;
	private PersonService personService = null;
	
	{
		
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		personService = ctx.getBean(PersonService.class);
	}
	
	@Test
	public void testPersonService(){
		
		Person p1 = new Person();
		p1.setAge(1);
		p1.setEmail("aa@gmail.com");
		p1.setLastName("AA");
		
		Person p2 = new Person();
		p2.setAge(12);
		p2.setEmail("bb@gmail.com");
		p2.setLastName("BB");
		
		
		System.out.println(personService.getClass().getName());
		personService.savePersons(p1, p2);
		
		
		
	}
	
	
	@Test
	public void testDataSource() throws SQLException {

		DataSource dataSource = ctx.getBean(DataSource.class);
		System.out.println(dataSource.getConnection());
	
	}

}
