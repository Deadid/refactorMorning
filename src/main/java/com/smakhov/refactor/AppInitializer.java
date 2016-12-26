package com.smakhov.refactor;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.smakhov.refactor.message.MessageFactory;
import com.smakhov.refactor.message.MessageService;

public class AppInitializer implements WebApplicationInitializer{

	private static MessageService messageService;


	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context = SpringContextProvider.getContext();
		servletContext.addListener(new ContextLoaderListener(context));
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("DispatcherServlet", new DispatcherServlet(context));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/*");
        MessageFactory factory = new MessageFactory();
        messageService = factory.start();
	}

	
	@Deprecated
	public static MessageService getMessageService() {
		return messageService;
	}
}
