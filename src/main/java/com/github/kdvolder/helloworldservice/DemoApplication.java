package com.github.kdvolder.helloworldservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ConcurrentTaskScheduler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@RestController
public class DemoApplication {

	@Autowired Greeter greeter;
	@Autowired TaskScheduler scheduler;

	@Bean TaskScheduler sched() {
		return new ConcurrentTaskScheduler();
	}

	@GetMapping("/hello")
	public String getMethodName(@RequestParam(defaultValue="World") String name) {
		return "Hohoho "+name+"!";
	}
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
