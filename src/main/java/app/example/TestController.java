package app.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class TestController {

	
	@Autowired
	private WebClient webClient;
	
	@GetMapping("/test")
	public String test() {
	
		return webClient.get().uri("http://localhost:8085/test").retrieve().bodyToMono(String.class).block();
				
	}
}
