package org.xyz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController1 {
	@GetMapping("/abc")
	public String met() {
		return "Hello World in diff package";
	}
}