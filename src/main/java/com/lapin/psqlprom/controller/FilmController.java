package com.lapin.psqlprom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lapin.psqlprom.dao.impl.FilmDaoImpl;
import com.lapin.psqlprom.model.Film;
import com.lapin.psqlprom.model.FilmRepository;

import io.micrometer.core.annotation.Timed;

import java.util.List;

@RestController
@Component
public class FilmController {

	@Autowired
	FilmDaoImpl filmDao;
	
	@Autowired
	FilmRepository filmRepo;

	/**
	 * @return random movie info
	 */
	@Timed
	@GetMapping("/film")
	public List<Film> getRandomMovie() {
//		return filmDao.getAllFilms();
		return filmRepo.findAll();
	}

}