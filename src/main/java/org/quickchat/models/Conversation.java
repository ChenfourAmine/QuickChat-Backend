package org.quickchat.models;

import java.util.List;
import java.util.Vector;


public class Conversation {

	private User firstUser;
	private User secondUser;
	private List<Message> messages;
	
	public Conversation() {
		this.messages = new Vector<Message>();
	}

	public Conversation(User firstUser, User secondUser) {
		this();
		this.firstUser = firstUser;
		this.secondUser = secondUser;
	}

	public User getFirstUser() {
		return firstUser;
	}

	public void setFirstUser(User firstUser) {
		this.firstUser = firstUser;
	}

	public User getSecondUser() {
		return secondUser;
	}

	public void setSecondUser(User secondUser) {
		this.secondUser = secondUser;
	}

	public List<Message> getMessages() {
		return messages;
	}
	
	public void addMessage(Message message) {
		this.messages.add(message);
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	
	
	
}
