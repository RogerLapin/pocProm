package com.lapin.psqlprom.dao;

import java.util.List;

import com.lapin.psqlprom.model.Film;

public interface FilmDao {
	public List<Film> getAllFilms();
}
