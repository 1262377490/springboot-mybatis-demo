package com.test.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.demo.service.ClothService;

@Controller
@RequestMapping(value="/page")
public class ClothController {
	@Autowired
	ClothService clothService;
	  @RequestMapping(value = "/index")
	    public String getCustomerList(ModelMap map) {
	        map.addAttribute("list",  clothService.getAll());
	        return "index";
	    }
}
