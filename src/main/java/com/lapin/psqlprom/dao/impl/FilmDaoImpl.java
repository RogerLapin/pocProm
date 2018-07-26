package com.lapin.psqlprom.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lapin.psqlprom.dao.FilmDao;
import com.lapin.psqlprom.model.Film;



@Service
public class FilmDaoImpl implements FilmDao {


//	@Autowired
//	private SessionFactory sessionFactory;
	
	@Override
	public List<Film> getAllFilms() {
//		 Session session = sessionFactory.getCurrentSession();
//	        session.beginTransaction();
//
//	        Query<Film> theQuery = session.createQuery("FROM FILMS", Film.class);
//
//	        List<Film> films = theQuery.getResultList();
//
//	        session.getTransaction().commit();
//
//	        return films;
	        return new ArrayList<Film>();
	}

}
