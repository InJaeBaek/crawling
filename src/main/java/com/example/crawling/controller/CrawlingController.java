package com.example.crawling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.crawling.service.CrawlingService;

@Controller
public class CrawlingController {
	
	@Autowired
	private CrawlingService crawlingService;
	
	@GetMapping(value = "/terror-zone")
	public String getTerroZone() {
		return crawlingService.GetTerrorZone();
	}	

}
