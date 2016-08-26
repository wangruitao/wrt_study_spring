//<start id="juggler_java" /> 
package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Juggler implements Performer {
  private int beanBags = 3;
  private String beanR = "wrt";

  public Juggler() {
  }

  public Juggler(int beanBags) {
	  this.beanBags = beanBags;
  }
  public Juggler(int beanBags, String beanR) {
    this.beanBags = beanBags;
    this.beanR = beanR;
  }

  public void perform() throws PerformanceException {
    System.out.println("JUGGLING " + beanBags + "--" + beanR + " BEANBAGS");
  }
  
  public static void main(String[] args) {
	  
	  ApplicationContext application = new ClassPathXmlApplicationContext("spring-idol.xml");
	  Juggler juggler = (Juggler)application.getBean("juggler");
	  try {
		juggler.perform();
	} catch (PerformanceException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
//<end id="juggler_java" />
