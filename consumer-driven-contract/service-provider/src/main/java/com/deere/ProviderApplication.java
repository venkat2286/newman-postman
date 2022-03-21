package com.deere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class ProviderApplication {
	private final String MY_PROJECT_PDL = "GlobalITSCSMyProjects-Deere@JohnDeere.com";
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

//  @Bean
//	public Docket newApiFpRepoBOMApplication(){
// 		return new Docket(DocumentationType.SWAGGER_2)
//				.groupName("FP-REP-BOM-API")
//				.select()
//				.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
//				.paths(PathSelectors.ant("/**"))
//				.build()
//				.apiInfo(apiInfoFPRepo())
//				.useDefaultResponseMessages(false);
//	}
//
//	private ApiInfo apiInfoFPRepo() {
//		return new ApiInfoBuilder()
//				.title("Forecast Project APIs")
//				.description("Rest based api's for Forecast Project")
//				.contact(new Contact("Forecast Project Team", "", MY_PROJECT_PDL))
//				.version("1.0")
//				.build();
//	}
}
