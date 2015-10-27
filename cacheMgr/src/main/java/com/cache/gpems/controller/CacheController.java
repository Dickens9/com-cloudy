package com.cache.gpems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/decorate")
public class CacheController {
	@RequestMapping(value = "/dialog")
	public String dialog(){
		return "mgr/dialog";
	}
	@RequestMapping(value = "/decorateDemo")
	public String decorateDemo(){
		return "mgr/decorateDemo";
	}
	@RequestMapping(value = "/index")
	public String index(){
		return "mgr/decorate";
	}
}
