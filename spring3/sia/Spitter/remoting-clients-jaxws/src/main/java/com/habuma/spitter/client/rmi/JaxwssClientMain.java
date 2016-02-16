package com.habuma.spitter.client.rmi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.habuma.spitter.domain.Spitter;
import com.habuma.spitter.service.SpitterService;

public class JaxwssClientMain {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("jaxws-client-context.xml");
    
    SpitterService jaxwssSpitterService = (SpitterService) context.getBean("jaxwssSpitterService");
    Spitter spitter = jaxwssSpitterService.getSpitter("habuma");
    System.out.println(spitter.getEmail()); 
  }
}
