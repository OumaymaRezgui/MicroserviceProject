package com.cifop.tn.departement_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DepartementMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartementMsApplication.class, args);
	}

}
