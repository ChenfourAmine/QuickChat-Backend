package org.quickchat.models;

import java.util.List;
import java.util.Vector;


public class Conversation {

	private User firstPerson;
	private User secondUser;
	private List<Message> messages;
	
	public Conversation() {
		this.messages = new Vector<Message>();
	}

	public Conversation(User firstPerson, User secondUser, List<Message> messages) {
		super();
		this.firstPerson = firstPerson;
		this.secondUser = secondUser;
		this.messages = messages;
	}

	public User getFirstPerson() {
		return firstPerson;
	}

	public void setFirstPerson(User firstPerson) {
		this.firstPerson = firstPerson;
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
