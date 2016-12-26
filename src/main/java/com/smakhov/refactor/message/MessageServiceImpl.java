package com.smakhov.refactor.message;

class MessageServiceImpl implements MessageService {

	private final MessageGenerator generator;

	public MessageServiceImpl(MessageGenerator generator) {
		this.generator = generator;
	}
	
	public String getEncryptedMessage() {
		// Some business logic, etc.
		return "Bussiness message;" + generator.generateMessage();
	}
	
}
