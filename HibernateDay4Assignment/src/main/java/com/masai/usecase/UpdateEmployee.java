package com.masai.usecase;

import java.util.Scanner;

import com.masai.employeedaoimpl.EmployeeDao;
import com.masai.employeedaoimpl.EmployeeDaoImpl;
import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public class UpdateEmployee {
	
	public static void main(String[] args) {
		
    EmployeeDao employeeDao = new EmployeeDaoImpl();
		
		Scanner scann = new Scanner(System.in);
		
		System.out.println("Enter Id, name, address,salary");
		
		Employee employee = new Employee();
		
		employee.setEmpId(scann.nextInt());
		employee.setName(scann.next());
		employee.setAddress(scann.next());
		employee.setSalary(scann.nextInt());
		
		
		try {
		Employee emp = employeeDao.updateEmployee(employee);
		}catch (EmployeeException ee) {
			
			System.out.println(ee.getMessage());
			
			ee.printStackTrace();
		}
		
		
	}

}
