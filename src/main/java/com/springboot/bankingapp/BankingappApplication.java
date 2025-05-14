package com.springboot.bankingapp;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Banking App",
				description = "Backend Rest API",
				version = "v1.0",
				contact = @Contact(
						name = "Anaclara Ferrando",
						email = "anaclaraferrando95@gmail.com",
						url = "https://github.com/anaclara-95/bankingapp"
				),
				license = @License(
						name = "FStailSolution"

				)

		),
		externalDocs = @ExternalDocumentation(
				description = "Banking App Documentation"

		)

)

public class BankingappApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingappApplication.class, args);
	}

}
