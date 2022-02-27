package com.factorydesignpattern;

public class EmailCommunication implements Communication {

	@Override
	public void process(Employee employee) {
		// TODO Auto-generated method stub
		
		System.out.println( employee.getName()+"  communicated via email"+employee.getEmail());
		
	}

}
