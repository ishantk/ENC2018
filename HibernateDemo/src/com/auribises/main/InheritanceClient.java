package com.auribises.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.auribises.model.CA;
import com.auribises.model.CC;
import com.auribises.model.Manager;
import com.auribises.model.CB;

public class InheritanceClient {

	public static void main(String[] args) {
		
		CA ca = new CA();
		ca.setA(10);
		
		CB cb = new CB();
		cb.setA(100);
		cb.setB(200);

		CC cc = new CC();
		cc.setA(1000);
		cc.setB(1000);
		cc.setC(1000);
		
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
			
			session.save(ca);
			session.save(cb);
			session.save(cc);
			
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
