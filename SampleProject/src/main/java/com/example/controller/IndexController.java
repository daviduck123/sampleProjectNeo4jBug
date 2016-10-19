package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.service.InitializationService;

@Controller
public class IndexController {
	@Autowired
	private InitializationService initializationService;

	@RequestMapping("/")
	public String index(Model model) {
		return "index";
	}

	@RequestMapping(value = "/initData")
	public ModelAndView initData() {
		initializationService.initData();
		ModelAndView model = new ModelAndView("redirect:/");
		return model;
	}
	
	@RequestMapping(value = "/initMachineSectionSummary")
	public ModelAndView initMachineSectionSummary() {
		initializationService.initMachineSectionSummary5OffsetMachine();
		ModelAndView model = new ModelAndView("redirect:/");
		return model;
	}
}