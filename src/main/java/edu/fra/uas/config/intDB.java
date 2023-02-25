package edu.fra.uas.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.fra.uas.model.Barchart;
import edu.fra.uas.repository.BarchartRepository;

@Component
public class intDB {

	@Autowired
	private BarchartRepository repository;
	
	@PostConstruct
	private void init() {
		Barchart barchart1 = new Barchart("a", 123);
		Barchart barchart2 = new Barchart("b", 124);
		Barchart barchart3 = new Barchart("test", 50);
		Barchart barchart4 = new Barchart("as",70);

		this.repository.save(barchart1);
		this.repository.save(barchart2);
		this.repository.save(barchart3);
		this.repository.save(barchart4);
		
	}
}
