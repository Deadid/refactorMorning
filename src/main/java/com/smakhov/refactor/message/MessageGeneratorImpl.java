package com.smakhov.refactor.message;

import java.util.UUID;

class MessageGeneratorImpl implements MessageGenerator {
	
	@Override
	public String generateMessage() {
		return UUID.randomUUID().toString();
	}

	
}
