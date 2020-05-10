package com.spring.boot.micro.services.i18n;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.server.i18n.LocaleContextResolver;

@RestController
public class I18nApi {
	@Autowired
	private MessageSource messageSource;

//	First Approach in I18n
	@GetMapping(path = "/i18n")
	public String helloWorld(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
		return messageSource.getMessage("good.morning.message", null, locale);
	}
	
//	Another way in I18n
	@GetMapping(path = "/i18nHeader")
	public String goodMorning() {
		return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
	}
}
