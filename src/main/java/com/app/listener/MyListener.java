package com.app.listener;

import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@EnableJms
public class MyListener {

	@JmsListener(destination="test-q")
	public void getMessage(String text) {
		System.out.println("CONSUMER"+text);
	}
}
