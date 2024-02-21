package com.ty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = { "com.ty.Entity" })
@ComponentScan({ "com.ty.Controller", "com.ty.ServiceImpl", "com.ty.securityConfig" })
@EnableJpaRepositories(basePackages = "com.ty.Repo")
public class FullStackProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullStackProjectApplication.class, args);
	}

}
