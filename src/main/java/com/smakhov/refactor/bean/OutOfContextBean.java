package com.smakhov.refactor.bean;

import com.smakhov.refactor.SpringContextProvider;

public class OutOfContextBean {

	private ExampleBean beanInside;
	
	public OutOfContextBean() {
		beanInside = SpringContextProvider.getContext().getBean(ExampleBean.class);
	}
	
	public ExampleBean getInsideBean() {
		return beanInside;
	}
	
}
