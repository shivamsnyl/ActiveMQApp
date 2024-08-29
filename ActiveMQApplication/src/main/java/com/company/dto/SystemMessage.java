package com.company.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class SystemMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	private String source;
	private String message;

}
