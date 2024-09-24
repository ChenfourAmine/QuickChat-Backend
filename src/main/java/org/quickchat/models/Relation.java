package org.quickchat.models;

import org.quickchat.enums.RelationType;

public class Relation {
	
	private User firstUser;
	private User secondUser;
	private RelationType relationType;
	
	public Relation() {
	}

	public Relation(User firstUser, User secondUser, RelationType relationType) {
		super();
		this.firstUser = firstUser;
		this.secondUser = secondUser;
		this.relationType = relationType;
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

	public RelationType getRelationType() {
		return relationType;
	}

	public void setRelationType(RelationType relationType) {
		this.relationType = relationType;
	}
	

}
