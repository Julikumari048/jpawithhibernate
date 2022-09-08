package com.masai.employeedaoimpl;

import javax.persistence.EntityManager;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.utility.EmUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
		

		Employee empl = null;
		
		
	  EntityManager eManager = EmUtil.providEntityManager();
		
		eManager.getTransaction().begin();
		
		if(employee != null) {
		eManager.persist(employee);
		
		empl = employee;
		
		}else {
			throw new EmployeeException("Provide Proper value");
		}
		eManager.getTransaction().commit();
		
		
		
			return employee;
		
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		
		Employee empl = null;
		
		EntityManager eManager = EmUtil.providEntityManager();
		
		empl = eManager.find(Employee.class, empId); //Manager.getTransaction().begin()
		
		if(empl == null) {
		
		
			throw new EmployeeException("Employee does not exist");
		}
		else {
			return empl;
		}
		
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
	Employee empl = null;
		
		EntityManager eManager = EmUtil.providEntityManager();
		
		empl = eManager.find(Employee.class, empId);
		
		
		
		if(empl != null) {
			eManager.getTransaction().begin();
			eManager.remove(empl);//persists ko q nhi call kiye
			 eManager.getTransaction().commit();
			 eManager.close();
		}
			else {
			throw new EmployeeException("Employee does not exist");
		}
      
		
		return empl;
	
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
       
		
		EntityManager eManager = EmUtil.providEntityManager();
	
		Employee empl;
		if(employee != null) {
			eManager.getTransaction().begin();
			 empl= eManager.merge(employee);
		eManager.getTransaction().commit();
		eManager.close();
		}
		
			else 
				throw new EmployeeException("Employee does not exist");
			
			
			
			
			return empl;
		}
	}
	
	


