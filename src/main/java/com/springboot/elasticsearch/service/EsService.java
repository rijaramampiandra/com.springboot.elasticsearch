package com.springboot.elasticsearch.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import com.springboot.elasticsearch.dto.CustomerDto;
import com.springboot.elasticsearch.model.Customer;

/**
 * The ES service.
 * 
 * @author Rija RAMAMPIANDRA.
 *
 */
public interface EsService {

	/**
	 * Find by ID.
	 * 
	 * @param idToFind
	 *            the ID.
	 * @return the list.
	 */
	CustomerDto findById(String idToFind);

	/**
	 * Find by firstname.
	 * 
	 * @param firstname
	 *            the first name to find.
	 * 
	 * @return the list of customer matching on find.
	 */
	List<CustomerDto> findByFirstName(String firstname);

	/**
	 * Find by firstname with pageable.
	 * 
	 * @param firstname
	 *            the first name to find.
	 * 
	 * @return the list of customer matching on find.
	 */
	Page<Customer> findByFirstName(String firstname, Pageable pageable);

	/**
	 * Find by age.
	 * 
	 * @param age
	 *            the age to find.
	 * 
	 * @return the list.
	 */
	List<CustomerDto> findByAge(int age);

	void save(CustomerDto customerDto);

	ResponseEntity<String> deleteById(String id);

}
