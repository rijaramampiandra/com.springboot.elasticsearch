package com.springboot.elasticsearch.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springboot.elasticsearch.dto.CustomerDto;
import com.springboot.elasticsearch.factory.CustomerFactory;
import com.springboot.elasticsearch.model.Customer;
import com.springboot.elasticsearch.repository.EsRepository;
import com.springboot.elasticsearch.service.EsService;

/**
 * 
 * @author Rija RAMAMPIANDRA.
 *
 */
@Service
public class EsServiceImpl implements EsService {

	@Autowired
	private EsRepository esRepository;

	@Autowired
	private CustomerFactory customerFactory;

	@Override
	public CustomerDto findById(String idToFind) {
		return customerFactory.getInstance(esRepository.findById(idToFind));
	}

	@Override
	public List<CustomerDto> findByFirstName(String firstname) {
		return customerFactory.getInstance(esRepository.findByFirstName(firstname));
	}

	@Override
	public Page<Customer> findByFirstName(String firstname, Pageable pageable) {
		return esRepository.findByFirstName(firstname, pageable);
	}

	@Override
	public List<CustomerDto> findByAge(int age) {
		return customerFactory.getInstance(esRepository.findByAge(age));
	}

	@Override
	public void save(CustomerDto customerDto) {
		final Customer entity = customerFactory.getInstance(customerDto);
		esRepository.save(entity);
	}

	@Override
	public ResponseEntity<String> deleteById(String id) {
		if (esRepository.existsById(id)) {
			esRepository.deleteById(id);
			return new ResponseEntity<String>("Index deleted.", HttpStatus.OK);
		}

		return new ResponseEntity<String>("Index not found", HttpStatus.OK);
	}

}
