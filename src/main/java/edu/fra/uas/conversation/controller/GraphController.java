package edu.fra.uas.conversation.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@RestController
//@RequestMapping(value = "/barChart")
@Controller
public class GraphController {
	private static final Logger log = LoggerFactory.getLogger(GraphController.class);
	
	@RequestMapping("/barChart")
	public String barChart(Model model) {
		log.debug("/barChart --> start ");
		return "barChart";
	}

	@RequestMapping("/barChartName")
	public String barChartName(Model model) {
		log.debug("/barChart_Name--> start ");
		return "barChartName";
	}

}