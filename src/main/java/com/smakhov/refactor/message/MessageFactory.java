package com.smakhov.refactor.message;

public class MessageFactory {
	private final MessageGenerator generator;
	private final MessageService service;
	
	public MessageFactory() {
		// generator could be injected anywhere where it need inside of message packet.
		this.generator = new MessageGeneratorImpl();
		this.service = new MessageServiceImpl(generator);
	}
	
	public MessageService start() {
		//Factory startup logic here.
		return service;
	}
}
