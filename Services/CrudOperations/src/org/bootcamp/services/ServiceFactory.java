package org.bootcamp.services;

public class ServiceFactory{

	public static UserService getLocalService() {
		return new UserServiceImp();
	}

	

}
