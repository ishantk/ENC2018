package com.auribises.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.auribises.model.Address;
import com.auribises.model.Person;

public class OneToOneClient {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setName("Jennie Watson");
		person.setEmail("jennie@example.com");
		person.setAge(28);
		
		
		Address address = new Address();
		address.setAdrsLine("Country Homes North");
		address.setCity("Ludhiana");
		address.setState("Punjab");
		address.setZipCode(141001);
		
		person.setAddress(address);
		address.setPerson(person);
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;

		try {
			
			config = new Configuration();
			config.configure(); // Read the XML File
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession();
			
			transaction = session.beginTransaction();
			
			//session.save(person);
			
			//Person pRef = (Person)session.get(Person.class, 2);
			//System.out.println(pRef);
			
			//Address aRef = (Address)session.get(Address.class, 2);
			//System.out.println(aRef);
			
			transaction.commit();
			
			System.out.println("Transaction Committed...");
			
		} catch (Exception e) {
			System.out.println("Some Exception Occurred..");
			e.printStackTrace();
			transaction.rollback();
		}finally{
			session.close();
		}
		

	}

}
