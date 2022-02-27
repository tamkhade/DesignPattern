package com.factorydesignpattern;

public class MobileCommunication implements Communication{

	@Override
	public void process(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println(employee.getName()+" Employee communicated through mobile "+employee.getPhoneNumber());
	}

	
}
