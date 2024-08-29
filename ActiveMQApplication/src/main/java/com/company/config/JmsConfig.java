package com.company.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;

import jakarta.jms.ConnectionFactory;

@Configuration
public class JmsConfig {
	
	@Bean
	DefaultJmsListenerContainerFactory jmsListenerContainerFactory(ConnectionFactory factory) {
		DefaultJmsListenerContainerFactory 	listenerFactory = new DefaultJmsListenerContainerFactory();
		
		listenerFactory.setConnectionFactory(factory);
		listenerFactory.setConcurrency("5-10");
		
		return listenerFactory;
		
	}

}
