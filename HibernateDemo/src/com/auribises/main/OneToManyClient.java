package com.auribises.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.auribises.model.Certificate;
import com.auribises.model.Manager;

public class OneToManyClient {

	public static void main(String[] args) {
		
		Certificate c1 = new Certificate();
		c1.setCname("OCJP");
		
		Certificate c2 = new Certificate(null,"AWS");
		
		Certificate c3 = new Certificate();
		c3.setCname("CCNA");
		
		ArrayList<Certificate> list = new ArrayList<Certificate>();
		list.add(c1);
		//list.add(c2);
		list.add(c3);
		
		Manager mgr = new Manager();
		mgr.setName("Jennie");
		mgr.setEmail("jennie@example.com");
		mgr.setSalary(70000);
		mgr.setCertificates(list);

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
			
			//session.save(mgr);
			
			Manager mRef = (Manager)session.get(Manager.class, 2);
			System.out.println(mRef);
			
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
