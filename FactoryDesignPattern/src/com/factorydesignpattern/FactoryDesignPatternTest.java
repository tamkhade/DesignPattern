package com.factorydesignpattern;

import java.util.ArrayList;
import java.util.List;

public class FactoryDesignPatternTest {
	
	
	
	public static void main(String[] args) {
		
		List<Employee> list = getAllListOfEmployee();
		
		 list.stream().forEach((emp) -> new CommmunicationFactory().getProcess(emp.getModeofcontact()).process(emp));
		
	}
	
	
	
	
	public static List<Employee> getAllListOfEmployee()
	{
		
		List<Employee> employeelist = new ArrayList<Employee>();
		
		Employee employee = new Employee("mahesh","1" , 27, "pune", "Email", "mtamkhade@gmail.com", "8600266237");
	
		Employee employee2 = new Employee("A","2" , 27, "pune", "Mobile", "mtamkhade@gmail.com", "8600266237");
		Employee employee3 = new Employee("B","3" , 27, "pune", "Email", "mtamkhade@gmail.com", "8600266237");
		Employee employee4 = new Employee("C","4" , 27, "pune", "Mobile", "mtamkhade@gmail.com", "8600266237");
		Employee employee5 = new Employee("D","5" , 27, "pune", "Email", "mtamkhade@gmail.com", "8600266237");
          employeelist.add(employee);
           employeelist.add(employee2);
           employeelist.add(employee3);
            employeelist.add(employee4);
            employeelist.add(employee5);
    return employeelist;
		
	}
	
	

}
