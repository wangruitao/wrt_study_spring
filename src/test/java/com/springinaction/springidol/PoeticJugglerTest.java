package com.springinaction.springidol;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( { "classpath:com/springinaction/springidol/spring-idol.xml" })
public class PoeticJugglerTest {

	  @Autowired
	  ApplicationContext context;
	  
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
