package com.springinaction.springidol;

public class Magician implements MindReader {
  private String thoughts;

  public void interceptThoughts(String thoughts) {
    System.out.println("Intercepting volunteer's thoughts");
    this.thoughts = thoughts;
  }
  
//  public void interceptThoughts() {
//	    System.out.println("Intercepting volunteer's thoughts 22");
//	  } 

  public String getThoughts() {
    return thoughts;
  }
}