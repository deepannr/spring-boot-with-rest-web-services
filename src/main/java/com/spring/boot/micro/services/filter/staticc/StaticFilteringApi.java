package com.spring.boot.micro.services.filter.staticc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaticFilteringApi {

	@GetMapping("/static-filter")
	public FilterFields getFilterField() {
		return new FilterFields("showField1", "hideField1", "hideField2", "hideField3");
	}
	
	@GetMapping("/static-filter-list")
	public List<FilterFields> getFilterFieldList() {
		return new ArrayList<FilterFields>(Arrays.asList(
				new FilterFields("showField01", "hideField01", "hideField02", "hideField03"),
				new FilterFields("showField11", "hideField11", "hideField22", "hideField13"),
				new FilterFields("showField21", "hideField21", "hideField22", "hideField23")
				));
	}
}