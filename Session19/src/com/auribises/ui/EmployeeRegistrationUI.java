package com.auribises.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.auribises.db.JDBCHelper;
import com.auribises.model.Employee;

public class EmployeeRegistrationUI implements ActionListener{
	
	Frame fr;
	Panel pnlTitle,pnlName, pnlSalary, pnlEmail, pnlAddress, pnlBtn, pnlAll;
	Label lblTitle, lblSalary, lblName, lblEmail, lblAddress;
	TextField txtSalary, txtName, txtEmail, txtAddress;
	Button btnSubmit, btnExit;
	
	Employee emp;
	
	public EmployeeRegistrationUI() {
		
		fr = new Frame("Employee Registration");
		//fr.setTitle("Employee Registration");
		
		pnlTitle = new Panel();
		pnlName = new Panel();
		pnlSalary = new Panel();
		pnlEmail = new Panel();
		pnlAddress = new Panel();
		pnlBtn = new Panel();
		pnlAll = new Panel();
		
		
		lblTitle = new Label("Enter Your Details");
		
		lblName = new Label();
		lblName.setText("Enter Your Name");
		
		lblSalary = new Label("Enter Your Salary");
		lblEmail = new Label("Enter Your Email");
		lblAddress = new Label("Enter Your Address");
		
		
		txtName = new TextField(16);
		txtSalary = new TextField(16);
		txtEmail = new TextField(16);
		txtAddress = new TextField(16);
		
		btnSubmit = new Button("Submit");
		//btnSubmit.setText("Submit");
		btnExit = new Button("Exit");
		
		btnSubmit.addActionListener(this);
		btnExit.addActionListener(this);
		
		emp = new Employee();
	}
	
	public void showFrame(){
		
		pnlTitle.add(lblTitle);
		
		pnlName.add(lblName);
		pnlName.add(txtName);
		
		pnlSalary.add(lblSalary);
		pnlSalary.add(txtSalary);
		
		pnlEmail.add(lblEmail);
		pnlEmail.add(txtEmail);
		
		pnlAddress.add(lblAddress);
		pnlAddress.add(txtAddress);
		
		pnlBtn.add(btnSubmit);
		pnlBtn.add(btnExit);
		
		pnlAll.add(pnlTitle);
		pnlAll.add(pnlName);
		pnlAll.add(pnlSalary);
		pnlAll.add(pnlEmail);
		pnlAll.add(pnlAddress);
		pnlAll.add(pnlBtn);
		
		GridLayout layout = new GridLayout(6, 1);
		pnlAll.setLayout(layout);
		
		fr.add(pnlAll);
		fr.setSize(400, 400);
		fr.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnSubmit){
			System.out.println("This is Awesome");
			
			String name = txtName.getText();
			String salary = txtSalary.getText();
			String email = txtEmail.getText();
			String address = txtAddress.getText();
			
			int iSalary = Integer.parseInt(salary);
			
			// Extract the data from UI and put it into Object
			emp.setName(name);
			//emp.setName(txtName.getText());
			emp.setSalary(iSalary);
			emp.setEmail(email);
			emp.setAddress(address);
			
			System.out.println(emp);

			// Persist the data in object into DB
			JDBCHelper helper = new JDBCHelper();
			helper.openConnection();
			helper.insertEmployee(emp);
			helper.closeConnection();
			
			clearFields();
			
		}else{
			fr.dispose();
		}
	}
	
	void clearFields(){
		txtName.setText("");
		txtSalary.setText("");
		txtEmail.setText("");
		txtAddress.setText("");
	}
}
