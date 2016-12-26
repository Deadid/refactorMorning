package com.smakhov.refactor.bean;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.smakhov.refactor.SpringTest;

public class OutOfContextBeanTest extends SpringTest{
	
	private OutOfContextBean bean = new OutOfContextBean();
	
	@Autowired
	private ExampleBean exampleBean;

	@Test
	public void testName() throws Exception {
		assertEquals(exampleBean, bean.getInsideBean());
	}
}
