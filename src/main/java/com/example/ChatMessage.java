package com.example;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class ChatMessage {

	@Getter @Setter
	private String sender;

	@Getter @Setter
	private String recipient;

	@Getter @Setter
	private String message;

	@Getter @Setter
	private Date time;

}