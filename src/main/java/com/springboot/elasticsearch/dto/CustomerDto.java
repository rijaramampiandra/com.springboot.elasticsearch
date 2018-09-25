package com.springboot.elasticsearch.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

/**
 * DTO to return to view.
 * 
 * @author Rija RAMAMPIANDRA.
 *
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class CustomerDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private int age;

	public CustomerDto() {
	}

	public CustomerDto(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

}
