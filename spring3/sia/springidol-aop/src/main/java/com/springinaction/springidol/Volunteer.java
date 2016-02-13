package com.springinaction.springidol;

public class Volunteer implements Thinker {
  private String thoughts;
  private String realThoughts;

  public void thinkOfSomething(String thoughts) {
    this.thoughts = thoughts;
  }
  
  public void thinkOfSomething(String thoughts, String realThoughts) {
	    this.realThoughts = realThoughts;
	  }

  public String getThoughts() {
    return thoughts;
  }

public String getRealThoughts() {
	return realThoughts;
}
  
  
  
}