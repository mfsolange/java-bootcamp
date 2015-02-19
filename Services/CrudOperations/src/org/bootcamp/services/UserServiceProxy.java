package org.bootcamp.services;

public class UserServiceProxy implements UserService {

	private final UserService service;
	
	public UserServiceProxy(UserServiceImp userServiceImp) {
		service = userServiceImp;
	}

	@Override
	public void addUser(int id, User user) {
		service.addUser(id, user);
	}

	@Override
	public void deleteUser(int id) {
		service.deleteUser(id);
	}

	@Override
	public void updateUserName(int id, String name) {
		service.updateUserName(id, name);
	}

	@Override
	public User getUser(int id) {
		return service.getUser(id);
	}

}
