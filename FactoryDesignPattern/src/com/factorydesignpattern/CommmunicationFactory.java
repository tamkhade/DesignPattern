package com.factorydesignpattern;

public class CommmunicationFactory { 
	
	public Communication getProcess(String modecommunication)
	{
		
		if("Email".equals(modecommunication))
		{
			
			return new EmailCommunication();
			
		}else
		{
			
			return new MobileCommunication();
		}
	}

}
