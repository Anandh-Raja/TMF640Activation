package com.wipro.mobileservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.mobileservice.entities.MobileAccessPostRequest;
import com.wipro.mobileservice.entities.RelatedParty;
import com.wipro.mobileservice.service.MobileService;

@RestController
@RequestMapping("/mobileservice")
public class MobileserviceController {
	@Autowired
	private MobileService service;
	@PostMapping("/")
	public MobileAccessPostRequest savedata(@RequestBody MobileAccessPostRequest newmobile) {
		return service.saveMobile(newmobile);
	}
	@GetMapping("/id")
	public Optional<MobileAccessPostRequest> findMobileById(@PathVariable("id") Long mobileid) {
		return service.findMobileById(mobileid);
	}
	@PostMapping("/")
	public Object savedata(@RequestBody RelatedParty newrp) {
		return service.saveRelatedParty(newrp);
	}
	}
