package com.smakhov.refactor.controller;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.smakhov.refactor.AppInitializer;
import com.smakhov.refactor.message.MessageService;

@RestController("/")
public class HomeController {

	private MessageService messages;
	
	@PostConstruct
	private void init() {
		messages = AppInitializer.getMessageService();
	}
	
	@RequestMapping("/hi")
	@ResponseBody
	public String hi() {
		return messages.getEncryptedMessage();
	}
}
