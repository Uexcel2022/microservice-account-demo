package com.eazybytes.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Account microservice REST API Documentation",
				description = "EazyBank microservice REST API Documentation",
				version = "0.0.1",
				contact = @Contact(
						name = "Uexcel Diamond",
						email = "eazybank@supportservice.com",
						url = "https://eazybank/contactcare.com"

				),
				license = @License(
						name = "Apache 2.0",
						url = "https://eazybank.com/licencence"
				),

				termsOfService = "https//eazybank/terms-of-service"

		),
		externalDocs = @ExternalDocumentation(
				 description = "Account microservices REST API Documentation",
				url = "https//eazybank/info"

		)

)

public class AccountsApplication {

	public static void main(String[] args) {

		SpringApplication.run(AccountsApplication.class, args);
		
	}

}
