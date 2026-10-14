package com.probestack.forgestudio.design.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "com.probestack.forgestudio.design.config.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Inventory and Order Management API")
                                .description("Sample API specification for managing products, warehouses, stock, orders and shipments. Uses example data and a placeholder base URL.")
                                .contact(
                                        new Contact()
                                                .name("Inventory API Support")
                                                .email("api-support@example.com")
                                )
                                .license(
                                        new License()
                                                .name("Apache 2.0")
                                                .url("https://www.apache.org/licenses/LICENSE-2.0.html")
                                )
                                .version("2.0.0")
                )
                .components(
                        new Components()
                                .addSecuritySchemes("bearerAuth", new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")
                                )
                )
        ;
    }
}