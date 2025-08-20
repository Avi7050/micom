package com.micom.WelcomeApi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "03-GREETAPI")
public interface GreetFeignClient {
	
	@GetMapping("/greet")
	public String invokeGreetApi();

}
