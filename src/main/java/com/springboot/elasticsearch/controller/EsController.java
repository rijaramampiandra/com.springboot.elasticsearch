package com.springboot.elasticsearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.elasticsearch.dto.CustomerDto;
import com.springboot.elasticsearch.service.EsService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Contact;
import io.swagger.annotations.Info;
import io.swagger.annotations.SwaggerDefinition;

/**
 * Controller.
 * 
 * @author Rija RAMAMPIANDRA.
 *
 */
@SwaggerDefinition(info = @Info(title = "Elastic search controller", version = "v1", description = "ES CRUD", contact = @Contact(name = "Rija RAMAMPIANDRA", email = "rijaramampiandra@gmail.com")), host = "http://localhost:8081/es")
@RestController
@RequestMapping(path = "/es")
public class EsController {

	@Autowired
	private EsService esService;

	@GetMapping("/findByFirstName/{firstName}")
	@ApiOperation(value = "Find by first name.")
	public List<CustomerDto> findByFirstName(@PathVariable String firstName) {
		return esService.findByFirstName(firstName);
	}

	@GetMapping("/findById/{id}")
	@ApiOperation(value = "Find by ID.")
	public CustomerDto findById(@PathVariable String id) {
		return esService.findById(id);
	}

	@PostMapping("/save")
	@ApiOperation(value = "Save new object to index.")
	public void saveIndex(@RequestBody CustomerDto customerDto) {
		esService.save(customerDto);
	}

	@DeleteMapping("/delete/{id}")
	@ApiOperation(value = "Delete by ID.")
	public ResponseEntity<String> deleteById(@PathVariable String id) {
		return esService.deleteById(id);
	}

}
