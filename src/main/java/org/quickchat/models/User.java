package org.quickchat.models;

import java.util.List;
import java.util.Vector;

import org.quickchat.enums.Gender;

public class User {

	private String id;
	private String userName;
	private String email;
	private String phoneNumber;
	private String photo;
	private Gender gender;
	private List<User> friends;
	private List<Conversation> conversations;
	
	public User() {
		this.friends = new Vector<User>();
		this.conversations = new Vector<Conversation>();
	}

	public User(String userName, String email, String phoneNumber, String photo, Gender gender) {
		this();
		this.userName = userName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.photo = photo;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public List<User> getFriends() {
		return friends;
	}
	
	public void addFriend(User friend) {
		this.friends.add(friend);
	}

	public void setFriends(List<User> friends) {
		this.friends = friends;
	}

	public List<Conversation> getConversations() {
		return conversations;
	}
	
	public void addConversation(Conversation conversation) {
		this.conversations.add(conversation);
	}

	public void setConversations(List<Conversation> conversations) {
		this.conversations = conversations;
	}
	
}
