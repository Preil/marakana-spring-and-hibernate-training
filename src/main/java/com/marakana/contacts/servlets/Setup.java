package com.marakana.contacts.servlets;

import java.sql.SQLException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.marakana.contracts.entities.Address;
import com.marakana.contracts.repositories.AddressRepository;

@WebListener
public class Setup implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

		
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		
		try {
			AddressRepository addressRepository = new AddressRepository();
			addressRepository.init();
			
			Address address = new Address("150 West Tasman Dr.", "San Jose", "CA", "95134");
			addressRepository.create(address);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
