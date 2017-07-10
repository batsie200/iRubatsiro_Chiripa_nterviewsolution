package com.econet.specialist;

import com.econet.specialist.restImpl.MessageReceiverController;
import com.econet.specialist.restImpl.RestImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.econet.specialist")
public class InterviewsolutionApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewsolutionApplication.class, args);

	}


}
