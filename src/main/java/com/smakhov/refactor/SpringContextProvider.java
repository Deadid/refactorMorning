package com.smakhov.refactor;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import com.smakhov.refactor.config.BeanConfig;

public class SpringContextProvider {
	
	private static AnnotationConfigWebApplicationContext  context;

	public synchronized  static AnnotationConfigWebApplicationContext  getContext() {
		if(context == null) {
			context = new AnnotationConfigWebApplicationContext();
			context.register(BeanConfig.class);
		}
		return context;
	}
}
