package com.mobiledin.kotlinrestdemo

import org.springframework.context.annotation.Configuration
import springfox.documentation.swagger2.annotations.EnableSwagger2
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.spi.DocumentationType
import org.springframework.context.annotation.Bean
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.builders.PathSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.service.Contact

@Configuration
@EnableSwagger2
class SwaggerConfiguration {
	
	@Bean
	open fun api(): Docket =
		Docket(DocumentationType.SWAGGER_2)
			.select()
			.apis(RequestHandlerSelectors.any())
			.paths(PathSelectors.any())
			.build()
			.apiInfo(apiInfo())
	
	fun apiInfo(): ApiInfo =
			ApiInfoBuilder()
			.title ("API REST Sample")
            .description ("Essa é a API de serviços Sample.")
            .license("Apache License Version 2.0")
            .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
            .termsOfServiceUrl("/service.html")
            .version("1.0.0")
            .contact(Contact("Mobiledin","https://www.mobiledin.com.br", "alessandro@mobiledin.com.br"))
            .build()
	
	
}