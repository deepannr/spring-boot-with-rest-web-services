package com.spring.boot.micro.services.filter.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/versioning")
class VersioningApi {

	// URI Versioning
	@GetMapping("/v1/person")
	public PersonV1 getPersonV1() {
		return new PersonV1("Dee", 40);
	}

	@GetMapping("/v2/person")
	public PersonV2 getPersonV2() {
		return new PersonV2(new Name("Dee", "Pan"), 40);
	}

	// Param Versioning
	@GetMapping(value = "person/param", params = "Version=1")
	public PersonV1 getParamV1() {
		return new PersonV1("Dee", 40);
	}

	@GetMapping(value = "/person/param", params = "Version=2")
	public PersonV2 getParamV2() {
		return new PersonV2(new Name("Dee", "Pan"), 40);
	}
	
	// Header Versioning
	@GetMapping(value = "person/header", headers = "X-VERSION-API=1")
	public PersonV1 getHeaderV1() {
		return new PersonV1("Dee", 40);
	}

	@GetMapping(value = "/person/header", headers = "X-VERSION-API=2")
	public PersonV2 getHeaderV2() {
		return new PersonV2(new Name("Dee", "Pan"), 40);
	}
	
	// MIME Versioning
	@GetMapping(value = "person/header", produces = "application/vnd.company.app-v1+json")
	public PersonV1 getProduceV1() {
		return new PersonV1("Dee", 40);
	}

	@GetMapping(value = "/person/header", produces = "application/vnd.company.app-v2+json")
	public PersonV2 getProduceV2() {
		return new PersonV2(new Name("Dee", "Pan"), 40);
	}
}
