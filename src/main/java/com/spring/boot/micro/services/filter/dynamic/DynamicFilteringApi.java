package com.spring.boot.micro.services.filter.dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class DynamicFilteringApi {

	@GetMapping("/dynamic-filter-list")
	public MappingJacksonValue getDynamicFilter() {
		List<TicketBooking> bookings = new ArrayList<>(
				Arrays.asList(
						new TicketBooking("Jaih", 7, true, true), 
						new TicketBooking("Dee", 40, true, true),
						new TicketBooking("Sub", 39, true, true), 
						new TicketBooking("Mal", 60, true, true)));

		PropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("name", "age");
		
		FilterProvider provider = new SimpleFilterProvider().addFilter("bookingFilter", filter);
		
		MappingJacksonValue mapping = new MappingJacksonValue(bookings);
		mapping.setFilters(provider);
		return mapping;
	}
	
	@GetMapping("/dynamic-filter-params")
	public MappingJacksonValue getDynamicFilterParams(@RequestParam Set<String> paramSet) {
		List<TicketBooking> bookings = new ArrayList<>(
				Arrays.asList(
						new TicketBooking("Jaih", 7, true, true), 
						new TicketBooking("Dee", 40, true, true),
						new TicketBooking("Sub", 39, true, true), 
						new TicketBooking("Mal", 60, true, true)));

		System.out.println("paramSet : " + paramSet);
		PropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept(paramSet);
		
		FilterProvider provider = new SimpleFilterProvider().addFilter("bookingFilter", filter);
		
		MappingJacksonValue mapping = new MappingJacksonValue(bookings);
		mapping.setFilters(provider);
		return mapping;
	}
}
