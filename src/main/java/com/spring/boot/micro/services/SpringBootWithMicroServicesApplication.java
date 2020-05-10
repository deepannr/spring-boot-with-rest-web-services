package com.spring.boot.micro.services;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class SpringBootWithMicroServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithMicroServicesApplication.class, args);
	}
	
/*
 * Here locale is set as US as session scope.
 */

//	First Approach in I18n
//	@Bean
//	public LocaleResolver localeResolver() {
//		SessionLocaleResolver localResolver = new SessionLocaleResolver();
//		localResolver.setDefaultLocale(Locale.US);
//		return localResolver;
//	}
	
// Another Way in I18n
	@Bean
	public LocaleResolver localeResolver() {
		AcceptHeaderLocaleResolver localResolver = new AcceptHeaderLocaleResolver();
		localResolver.setDefaultLocale(Locale.US);
		return localResolver;
	}
	
//	First Approach in I18n
//	@Bean
//	public ResourceBundleMessageSource bundleMessageSource() {
//		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//		messageSource.setBasename("messages");
//		return messageSource;
//	}
}
