package com.springboot.elasticsearch.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.springboot.elasticsearch.model.Customer;

/**
 * Es repository.
 * 
 * @author Rija RAMAMPIANDRA.
 *
 */
public interface EsRepository extends ElasticsearchRepository<Customer, String> {

	/**
	 * Find by firstname.
	 * 
	 * @param firstname
	 *            the first name to find.
	 * 
	 * @return the list of customer matching on find.
	 */
	List<Customer> findByFirstName(String firstname);

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
	List<Customer> findByAge(int age);
}