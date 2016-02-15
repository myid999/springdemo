package com.habuma.spitter.client.rmi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.habuma.spitter.service.rmi.HelloService;

public class RmiClientMain {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("remoting-client-context.xml");
    HelloService hs = (HelloService) context.getBean("helloService");
    hs.sayHello("ssss");
  }
}
