package message;

import java.util.*;

public class User extends person {
	
	ArrayList<User> contacts;
	HashMap<User,Dm> Dm;
	Status status;
	
	public User(String name) {
		super(name);
		this.contacts = new ArrayList();
		Dm = new HashMap();
		this.status = new Status();
	}
	public void addContact(User u) {
		contacts.add(u);
		
	}
	public void addStatus(Message m) {
		Status.setStatus(m);	
	}
	
}
