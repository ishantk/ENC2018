package com.auribises.ui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.auribises.db.JDBCHelper;
import com.auribises.model.Employee;

public class SwingEmployeeRegistrationUI  implements ActionListener,FocusListener{
	
	JFrame fr;
	JPanel pnlTitle,pnlName, pnlSalary, pnlEmail, pnlAddress, pnlBtn, pnlAll;
	JLabel lblTitle, lblSalary, lblName, lblEmail, lblAddress;
	JTextField txtSalary, txtName, txtEmail, txtAddress;
	JButton btnSubmit, btnExit;
	
	Employee emp;
	
	public SwingEmployeeRegistrationUI() {
		
		fr = new JFrame("Employee Registration");
		//fr.setTitle("Employee Registration");
		
		pnlTitle = new JPanel();
		pnlName = new JPanel();
		pnlSalary = new JPanel();
		pnlEmail = new JPanel();
		pnlAddress = new JPanel();
		pnlBtn = new JPanel();
		pnlAll = new JPanel();
		
		
		lblTitle = new JLabel("Enter Your Details");
		
		lblName = new JLabel();
		lblName.setText("Enter Your Name");
		
		lblSalary = new JLabel("Enter Your Salary");
		lblEmail = new JLabel("Enter Your Email");
		lblAddress = new JLabel("Enter Your Address");
		
		
		txtName = new JTextField(16);
		txtSalary = new JTextField(16);
		txtEmail = new JTextField(16);
		
		txtEmail.addFocusListener(this);
		
		
		txtAddress = new JTextField(16);
		
		btnSubmit = new JButton("Submit");
		//btnSubmit.setText("Submit");
		btnExit = new JButton("Exit");
		
		btnSubmit.addActionListener(this);
		btnSubmit.setBackground(Color.GREEN);
		
		btnExit.addActionListener(this);
		btnExit.setBackground(Color.RED);
		
		emp = new Employee();
	}
	
	boolean validateFields(){
		
		boolean flag = true;
		
		if(txtName.getText().isEmpty())
			flag = false;
		
		if(txtEmail.getText().isEmpty()){
			flag = false;
		}else{
			if(!txtEmail.getText().contains("@") && !txtEmail.getText().contains(".")){
				flag = false;
			}
		}
		
		if(txtSalary.getText().isEmpty())
			flag = false;
		
		if(txtAddress.getText().isEmpty())
			flag = false;
		
		return flag;
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
			
			int iSalary = 0;
			
			try {
				iSalary = Integer.parseInt(salary);
			} catch (NumberFormatException e1){
				System.out.println("Sorry Cannot Convert to Integer");
				e1.printStackTrace();
			}
			
			// Extract the data from UI and put it into Object
			emp.setName(name);
			//emp.setName(txtName.getText());
			emp.setSalary(iSalary);
			emp.setEmail(email);
			emp.setAddress(address);
			
			System.out.println(emp);

			// Persist the data in object into DB
			
			if(validateFields()){
				JDBCHelper helper = new JDBCHelper();
				helper.openConnection();
				helper.insertEmployee(emp);
				helper.closeConnection();
				clearFields();
			}else{
				lblTitle.setText("Please Enter All Details First !!");
				lblTitle.setBackground(Color.RED);
			}
			
			
			
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

	@Override
	public void focusGained(FocusEvent e) {
		System.out.println("Focus Gained"); 
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		
		/*if(e.getSource() == txtEmail){
			
		}*/
		
		System.out.println("Focus Lost");
		if(txtEmail.getText().isEmpty()){
			lblTitle.setText("Please Enter Email");
		}
		
	}
}
