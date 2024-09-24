package org.quickchat.models;

import java.util.Date;

import org.quickchat.enums.MessageType;

public class Message {

	private String id;
	private User sender;
	private User receiver;
	private String content;
	private Date date;
	private MessageType type;
	
	public Message() {
	}

	public Message(String id, User sender, User receiver, String content) {
		super();
		this.id = id;
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
		this.date = new Date();
		this.type = MessageType.text;
	}

	public Message(User sender, User receiver, String content, Date date, MessageType type) {
		super();
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
		this.date = date;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public User getReceiver() {
		return receiver;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public MessageType getType() {
		return type;
	}


	public void setType(MessageType type) {
		this.type = type;
	}
	
	
}
