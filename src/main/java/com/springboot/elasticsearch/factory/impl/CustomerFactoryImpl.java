package com.springboot.elasticsearch.factory.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.springboot.elasticsearch.dto.CustomerDto;
import com.springboot.elasticsearch.factory.CustomerFactory;
import com.springboot.elasticsearch.model.Customer;

/**
 * Converter implementation.
 * 
 * @author Rija RAMAMPIANDRA.
 *
 */
@Component
public class CustomerFactoryImpl implements CustomerFactory {

	@Override
	public CustomerDto getInstance() {
		return new CustomerDto();
	}

	@Override
	public CustomerDto getInstance(Customer domainObject) {
		final CustomerDto instance = getInstance();
		instance.setAge(domainObject.getAge());
		instance.setFirstName(domainObject.getFirstName());
		instance.setLastName(domainObject.getLastName());
		return instance;
	}

	@Override
	public CustomerDto getInstance(Optional<Customer> customerDo) {
		if (customerDo.isPresent()) {
			return getInstance(customerDo.get());
		}
		return null;
	}

	@Override
	public Customer getInstance(CustomerDto customerDto) {
		final Customer customerDo = new Customer();
		customerDo.setAge(customerDto.getAge());
		customerDo.setFirstName(customerDto.getFirstName());
		customerDo.setLastName(customerDto.getLastName());
		return customerDo;
	}

	@Override
	public List<CustomerDto> getInstance(List<Customer> listCustomer) {
		final List<CustomerDto> listResponse = new ArrayList<>();
		if (listCustomer.isEmpty()) {
			return listResponse;
		}

		listCustomer.forEach(domainObject -> {
			listResponse.add(getInstance(domainObject));
		});

		return listResponse;
	}

}
