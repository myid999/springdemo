package com.habuma.spitter.service.rmi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RmiMain {
  public static void main(String[] args) {
	  
	 String [] configFiles= new String[]{ 
			 "remote-service-context-2.xml",
			 "remote-service-context.xml",
			    "service-context.xml",
			    "persistence-context.xml",
			    "dataSource-context.xml"};
	 
	  
    ApplicationContext context = new ClassPathXmlApplicationContext(configFiles);
    
  }
}
