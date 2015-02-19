package org.bootcamp.services;

public interface UserService {
	
	/**
	 * Adds a user to the data base
	 * @param id Determines the user's unique ID.
	 * @param user Determines the user to be added to the data base
	 */
	public void addUser(int id, User user);
	
	/**
	 * Deletes from data base the user specified by its ID.
	 * @param id Determines the user's ID
	 */
	public void deleteUser(int id);
	
	/**
	 * Updates the name of the specified user
	 * @param id Determines the user's ID to be updated
	 * @param name Determines the new name the user will get
	 */
	public void updateUserName(int id, String name);

	/**
	 * Method responsible for obtaining a specified user
	 * @param id Determines the user's ID
	 * @return User
	 */
	public User getUser(int id);
}
