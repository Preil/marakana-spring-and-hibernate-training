package com.marakana.contacts.servlets;

import java.sql.SQLException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.marakana.contracts.repositories.AddressRepository;
import com.marakana.contracts.repositories.ContactRepository;

@WebListener
public class Setup implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

		
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		
		try {
			
			new AddressRepository().init();
			new ContactRepository().init();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
