package com.lapin.psqlprom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lapin.psqlprom.model.FilmRepository;

@SpringBootApplication
public class Psqlprom {
	   
	@Autowired
	FilmRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(Psqlprom.class, args);
	}
	

}