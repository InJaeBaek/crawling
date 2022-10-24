package com.example.crawling.service;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

@Service
public class CrawlingService {
	
	public String GetTerrorZone() {
		
		String terrorZoneName = "";
		final String terrorZoneUrl = "https://d2runewizard.com/terror-zone-tracker";
		Connection conn = Jsoup.connect(terrorZoneUrl);
		Document document;
		
		try {
			document = conn.get();
			System.out.println("document value" + document);
			terrorZoneName = document.select("meta[name=description]").attr("content").split("\\.")[0];
			System.out.println(terrorZoneName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return terrorZoneName;
		
	}
	
}
