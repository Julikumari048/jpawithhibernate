package com.masai.usecase;

import java.util.Scanner;

import com.masai.employeedaoimpl.EmployeeDao;
import com.masai.employeedaoimpl.EmployeeDaoImpl;
import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public class RemoveEmployee {
	
	public static void main(String[] args) {
		
     EmployeeDao employeeDao = new EmployeeDaoImpl();
		
		Scanner scann = new Scanner(System.in);
		
		System.out.println("Enter empid");
		
		Employee empl;
		try {
			empl = employeeDao.deleteEmployeeById(scann.nextInt());
			
			if(empl != null) 
				
				System.out.println("Employee deleted sucessfully from thr table");
				
		} catch (EmployeeException ee) {
			System.out.println(ee.getMessage());
			ee.printStackTrace();
		}
		 
	}

}
