package com.springinaction.springidol;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( { "classpath:spring-idol.xml" })
public class PoeticJugglerTest {

	  @Autowired
	  ApplicationContext context;
	  
	@Test
	public void test() {
		/*Juggler juggler = context.getBean("juggler", Juggler.class);
		try {
			juggler.perform();
		} catch (PerformanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Sonnet29 sonnet = context.getBean("sonnet", Sonnet29.class);
		sonnet.recite();
		Sonnet29 sonnet = context.getBean("sonnet", Sonnet29.class);
		Sonnet29 sonnet1 = context.getBean("sonnet1", Sonnet29.class);
		Auditorium s = context.getBean("auditorium", Auditorium.class);*/
		Global s = context.getBean("global", Global.class);
		s.print();
	}

}
