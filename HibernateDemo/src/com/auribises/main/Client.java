package com.auribises.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.auribises.model.Employee;

public class Client {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setEid(1);
		emp1.setName("Fionna");
		emp1.setSalary(58000);
		emp1.setEmail("fionna@example.com");
		emp1.setAddress("Redwood Shores");

		Employee emp2 = new Employee(2, "George","george@example.com",67000,"Country Homes");
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		// Hibernate API's
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new Configuration();
			config.configure();
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession();
			
			transaction = session.beginTransaction();
			
			
			// Inserting the Employee Object in Database
			//session.save(emp1);
			//session.save(emp2);
			
			// Retrieve
			//Employee eRef = (Employee)session.get(Employee.class, 2);
			//System.out.println(eRef);
			
			//Update
			/*eRef.setName("Jennie JJ");
			eRef.setSalary(87500);
			session.update(eRef);*/
			
			/*Employee eRef = new Employee();
			eRef.setEid(3);
			session.delete(eRef);*/
			
			//String hql = "From Employee";
			//String hql = "From Employee where eid > 1";
			//List<Employee> empList = session.createQuery(hql).list();
			
			Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.gt("eid", 1));
			
			List<Employee> empList = criteria.list();
			
			for(Employee emp : empList){
				System.out.println(emp);
				System.out.println("----------------------------------");
			}
			
			transaction.commit();
			System.out.println("--Transaction Committed--");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
	}

}
