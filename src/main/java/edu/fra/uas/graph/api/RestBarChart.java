/*package edu.fra.uas.graph.api;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class RestBarChart {

	@RestController
	@RequestMapping("/api/barChart")
	public class BarChartApiController {
		private static final Logger log = LoggerFactory.getLogger(BarChartApiController.class);
		
		@PostMapping
		public void saveData(@RequestBody List<DataPoint> dataPoints) {
			log.debug("Saving data points: {}", dataPoints);
			// Save the data points to a database or file system
		}
		
		@GetMapping
		public List<DataPoint> getData() {
			log.debug("Getting data points");
			// Retrieve the data points from a database or file system
			return DataPoints;
		}
		
		private static class DataPoint {
			private String name;
			private int value;
			
			public String getName() {
				return name;
			}
			
			public void setName(String name) {
				this.name = name;
			}
			
			public int getValue() {
				return value;
			}
			
			public void setValue(int value) {
				this.value = value;
			}
		}
	}
}*/