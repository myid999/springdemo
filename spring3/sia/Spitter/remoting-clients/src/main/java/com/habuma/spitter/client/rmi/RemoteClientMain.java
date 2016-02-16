package com.habuma.spitter.client.rmi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.habuma.spitter.domain.Spitter;
import com.habuma.spitter.service.SpitterService;
import com.habuma.spitter.service.rmi.HelloService;

public class RemoteClientMain {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
    		new String[]{
    				"burlap-client-context.xml",
    				"hessian-client-context.xml",
    				"httpInvoker-client-context.xml"
    						}
    		);
    
    SpitterService burlapSpitterService = (SpitterService) context.getBean("burlapSpitterService");
    System.out.println( burlapSpitterService.getSpitter("habuma").getEmail());
    
    
    SpitterService hessianSpitterService = (SpitterService) context.getBean("hessianSpitterService");
    System.out.println( hessianSpitterService.getSpitter("habuma").getEmail());
    
    
    SpitterService httpInvokerSpitterService = (SpitterService) context.getBean("httpInvokerSpitterService");
    System.out.println( httpInvokerSpitterService.getSpitter("habuma").getEmail());
    
    
  }
}
