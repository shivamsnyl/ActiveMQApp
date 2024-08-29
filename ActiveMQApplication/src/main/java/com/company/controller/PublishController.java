package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.dto.SystemMessage;

@RestController
@RequestMapping("/produce")
public class PublishController {
	
	@Autowired
	JmsTemplate template;
	
	@PostMapping
	ResponseEntity<?> createMessage(@RequestBody SystemMessage message){
		template.convertAndSend("bridge-queue",message);
		return new ResponseEntity<>("Message Created::"+message,HttpStatus.OK);
	}
	
	

}
