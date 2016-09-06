//<start id="juggler_java" /> 
package com.springinaction.springidol;

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
  
}
//<end id="juggler_java" />
