package com.lapin.psqlprom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lapin.psqlprom.dao.impl.FilmDaoImpl;
import com.lapin.psqlprom.model.Film;
import com.lapin.psqlprom.model.FilmRepository;

import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.Tag;
import io.micrometer.core.instrument.binder.db.DatabaseTableMetrics;

import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

@RestController
@Component
public class FilmController {

	@Autowired
	FilmDaoImpl filmDao;
	
	@Autowired
	FilmRepository filmRepo;

	
	@Autowired
	DataSource datasource;
	


	/**
	 * @return random movie info
	 */
	@Timed
	@GetMapping("/film")
	public List<Film> getRandomMovie() {
		
		
		DatabaseTableMetrics.monitor(Metrics.globalRegistry, datasource, "db.psql", "films",Arrays.asList(Tag.of("key", "value")));
		
		
//		return filmDao.getAllFilms();
		return filmRepo.findAll();
	}

}