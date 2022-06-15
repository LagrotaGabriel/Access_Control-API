package br.com.homeaccesscontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("br.com.homeaccesscontrol.repositories")
@EntityScan(basePackages = {"br.com.homeaccesscontrol.models"})
@ComponentScan("br.com.homeaccesscontrol.services")
@ComponentScan("br.com.homeaccesscontrol.controllers")
public class AccesscontrolApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccesscontrolApplication.class, args);
	}

}
