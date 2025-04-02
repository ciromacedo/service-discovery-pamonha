package br.com.pamonhariadomacedo.servicedicovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServicedicoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicedicoveryApplication.class, args);
	}

}
