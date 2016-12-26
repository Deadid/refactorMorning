package com.smakhov.refactor.bean;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;


@Component
public class ExampleBean {

	@PostConstruct
	private void init() {
		System.out.println("ExampleBean initialized");
	}
	
	public void foo() {
		System.out.println("ExampleBean::foo");
	}
}
