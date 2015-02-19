package org.bootcamp.tests;

import static org.junit.Assert.*;

import org.bootcamp.services.DataBase;
import org.bootcamp.services.User;
import org.junit.Test;

public class DBTester {

	@Test
	public void addUserTest() {
		
		//Given
		DataBase db = DataBase.getInstance();
		User expected = new User("John Doe");

		//When
		db.addUser(expected, 1);
		User actual = db.getUser(1);
		
		//Then
		assertNotNull(actual);
		assertEquals(expected,actual);
	}
	
	@Test
	public void deleteUserTest(){
		//Given
		DataBase db = DataBase.getInstance();
		User toBeDeleted = new User("John Doe");
		int id = 2;
		
		//When
		db.addUser(toBeDeleted, id);
		db.deleteUser(id);
		User actual = db.getUser(id);
		
		//Then
		assertNull(actual);
	}
	
	@Test
	public void updateUserTest(){
		
		//Given
		DataBase db = DataBase.getInstance();
		User toBeUpdated = new User("John Doe");
		String expected = "John Doe Junior";
		int id = 3;
		
		//When
		db.addUser(toBeUpdated, id);
		db.updateUserName(id,expected);
		User actual = db.getUser(id);
		
		//Then
		assertNotNull(actual);
		assertEquals(expected, actual.getName());
	}

}
