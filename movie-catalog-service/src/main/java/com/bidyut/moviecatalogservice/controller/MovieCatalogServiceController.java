package com.bidyut.moviecatalogservice.controller;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bidyut.moviecatalogservice.model.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogServiceController {
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId)
	{
		CatalogItem items= new CatalogItem();
		items.setDesc("testing");
		items.setName("test name");
		items.setRatting(4);
		return Collections.singletonList(items);
	}

}
