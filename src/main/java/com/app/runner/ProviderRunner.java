package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
@Order(10)
public class ProviderRunner implements CommandLineRunner {
	@Autowired
	private JmsTemplate template;
	@Override
	public void run(String... args) throws Exception {
		//template.setPubSubDomain(true);
		template.send("test-q", (ses)->ses.createTextMessage("HAAH"));
		
	}

}
