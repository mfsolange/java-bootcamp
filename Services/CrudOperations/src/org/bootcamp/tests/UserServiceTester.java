package org.bootcamp.tests;

import static org.junit.Assert.*;

import org.bootcamp.services.User;
import org.bootcamp.services.UserService;
import org.bootcamp.services.UserServiceImp;
import org.bootcamp.services.UserServiceProxy;
import org.junit.Test;

public class UserServiceTester {

	@Test
	public void addUserTest() {
		
		//Given
		UserService service = new UserServiceProxy(new UserServiceImp());
		User expected = new User("Juan Perez");
		int id = 1;
		
		//When
		service.addUser(id, expected);
		User actual = service.getUser(id);
		
		//Then
		assertNotNull(actual);
		assertEquals(expected,actual);
		
		
	}
	
	@Test
	public void deleteUserTest(){
		
		//Given
		UserService service = new UserServiceProxy(new UserServiceImp());
		User toBeDeleted = new User("Maria Marta");
		int id = 2;
		
		//When
		service.addUser(id,toBeDeleted);
		service.deleteUser(id);
		User actual = service.getUser(id);
		
		//Then
		assertNull(actual);
	}
	
	@Test
	public void updateUserNameTest(){
		
		//Given
		UserService service = new UserServiceProxy(new UserServiceImp());
		User toBeUpdated = new User("NN");
		String expected = "Sin Nombre";
		int id = 3;
		
		//When
		service.addUser(id, toBeUpdated);
		service.updateUserName(id, "Sin Nombre");
		String actual = service.getUser(id).getName();
		
		//Then
		assertNotNull(actual);
		assertEquals(expected,actual);
		
	}

}
