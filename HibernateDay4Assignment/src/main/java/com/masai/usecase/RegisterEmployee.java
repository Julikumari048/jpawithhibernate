package com.masai.usecase;

import java.util.Scanner;

import com.masai.employeedaoimpl.EmployeeDao;
import com.masai.employeedaoimpl.EmployeeDaoImpl;
import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public class RegisterEmployee {
	
	public static void main(String[] args) throws Exception{
		
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		
		Scanner scann = new Scanner(System.in);
		
		System.out.println("Enter Name, Address and Salary");
		
		Employee empl = new Employee();
		
		empl.setName(scann.next());
		empl.setAddress(scann.next());
		empl.setSalary(scann.nextInt());
		
		Employee emp;
		
		try {
			
			emp = employeeDao.registerEmployee(empl);
			System.out.println(emp);
			
		} catch (EmployeeException ee) {
			System.out.println(ee.getMessage());
			ee.printStackTrace();
		}
			
		
	}

}
