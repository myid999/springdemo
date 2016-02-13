package com.springinaction.springidol;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( { "sneaky-magician.xml" })
public class MindReaderTest {
  @Autowired
  MindReader magician;

  @Autowired
  Thinker volunteer;

  @Test
  public void magicianShouldReadVolunteersMind() {
    volunteer.thinkOfSomething("Queen of Hearts");
    
//    volunteer.thinkOfSomething("Queen of Hearts","real thoughts");

    assertEquals("Queen of Hearts", magician.getThoughts());
  }
}
