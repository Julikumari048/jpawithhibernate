package com.masai.usecase;

import java.util.Scanner;

import com.masai.employeedaoimpl.EmployeeDao;
import com.masai.employeedaoimpl.EmployeeDaoImpl;
import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public class GetEmployeeByID {
	
	public static void main(String[] args) {
		
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		
		Scanner scann = new Scanner(System.in);
		
		System.out.println("Emter Employee Id");
		
		Employee emp;
		
		try {
			emp = employeeDao.getEmployeeById(scann.nextInt());
			
			System.out.println(emp);
		} catch (EmployeeException ee) {
			System.out.println(ee.getMessage());
			ee.printStackTrace();
		}
		
	}

}
