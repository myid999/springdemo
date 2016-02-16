package com.habuma.spitter.remoting.jaxws;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServerMain {
  public static void main(String[] args) {
	  
	 String [] configFiles= new String[]{ 
			 "remote-service-context.xml",
			    "service-context.xml",
			    "persistence-context.xml",
			    "dataSource-context.xml"};
    
    ApplicationContext context = new ClassPathXmlApplicationContext(configFiles);
    
  }
}
