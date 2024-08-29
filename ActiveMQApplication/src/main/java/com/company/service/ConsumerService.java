package com.company.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import com.company.dto.SystemMessage;

@Service
public class ConsumerService {
	
	private Logger logger = LoggerFactory.getLogger(ConsumerService.class);
	
	@JmsListener(destination="bridge-queue")
	void consumeSystemMsg(SystemMessage msg) {
		//System.out.println("====="+ msg);
		logger.info("Message Received :: {}", msg);
	}

}
