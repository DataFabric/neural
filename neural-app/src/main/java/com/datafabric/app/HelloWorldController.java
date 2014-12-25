/**
 * 
 */
package com.datafabric.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author psurti
 */
@RestController
public class HelloWorldController {
	@RequestMapping("/hello-world")
	public String index() {
		return "Hello World - Spring Boot!";
	}
}
