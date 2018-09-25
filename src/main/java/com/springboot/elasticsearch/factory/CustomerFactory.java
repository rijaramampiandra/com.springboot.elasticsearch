package com.springboot.elasticsearch.factory;

import java.util.List;
import java.util.Optional;

import com.springboot.elasticsearch.dto.CustomerDto;
import com.springboot.elasticsearch.model.Customer;

/**
 * Factory to convert domain object to domain transfer object.
 * 
 * @author Rija RAMAMPIANDRA.
 *
 */
public interface CustomerFactory {
	/**
	 * Create new instance of InstallationDto;
	 * 
	 * @return addressDto
	 */
	CustomerDto getInstance();

	CustomerDto getInstance(Customer domainObject);

	CustomerDto getInstance(Optional<Customer> listCustomer);

	Customer getInstance(CustomerDto customerDto);

	List<CustomerDto> getInstance(List<Customer> listCustomer);

}
