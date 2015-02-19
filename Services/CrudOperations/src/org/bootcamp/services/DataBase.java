package org.bootcamp.services;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
	
	private final static DataBase dataBase = new DataBase();
	private final Map<Integer,User> users;
	
	private DataBase(){
		users = new HashMap<Integer,User>();
	}

	public static DataBase getInstance() {
		return dataBase;
	}

	public void addUser(User user, int id) {
		users.put(id,user);
	}

	public User getUser(int id) {
		return users.get(id);
	}

	public void deleteUser(int id) {
		users.remove(id);
	}

	public void updateUserName(int id, String name) {
		User newUser = users.get(id);
		newUser.setName(name);
		users.put(id,newUser);
	}

}
