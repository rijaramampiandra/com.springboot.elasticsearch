package com.springboot.elasticsearch.model;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Data;

/**
 * Domain object definition.
 * 
 * @author Rija RAMAMPIANDRA.
 *
 */
@Data
@Document(indexName = "index_spring_es", type = "tutorial")
public class Customer {
	@Id
	private String id = UUID.randomUUID().toString();
	private String firstName;
	private String lastName;
	private int age;
}
