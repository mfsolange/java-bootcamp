package org.bootcamp.services;

public class UserServiceImp implements UserService{
	
	private final DataBase db;
	
	public UserServiceImp(){
		db = DataBase.getInstance();
	}

	@Override
	public void addUser(int id, User user) {
		db.addUser(user, id);
	}

	@Override
	public void deleteUser(int id) {
		db.deleteUser(id);
	}

	@Override
	public void updateUserName(int id, String name) {
		db.updateUserName(id, name);
	}

	@Override
	public User getUser(int id) {
		return db.getUser(id);
	}

}
