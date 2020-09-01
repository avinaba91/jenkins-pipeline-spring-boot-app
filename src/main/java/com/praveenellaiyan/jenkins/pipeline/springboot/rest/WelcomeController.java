/**
 * 
 */
package com.praveenellaiyan.jenkins.pipeline.springboot.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author praveenellaiyan
 *
 */
@RestController
public class WelcomeController {

	@RequestMapping
	public ResponseEntity<String> welcome() {
		return ResponseEntity.ok("Welcome to Jenkins tutorial!");
	}
}
