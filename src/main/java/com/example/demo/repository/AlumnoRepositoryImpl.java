package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Alumno;

@Repository
public class AlumnoRepositoryImpl implements  AlumnoRepositorio{

	private static List <Alumno> alumnos = new ArrayList<Alumno>();
	
	static {
		Alumno alumno = new Alumno();
		alumno.setId(1);
		alumno.setNombre("Omar");
		alumno.setApellidos("Tolentino");
		alumno.setEdad(30);
		alumno.setCarrera("Sistemas");
		alumnos.add(alumno);
	}
		
	@Override
	public Alumno add(Alumno alumno) {
		// TODO Auto-generated method stub
		alumno.setId(alumnos.size()+1);
		alumnos.add(alumno);
		return alumno;
	}

	@Override
	public List<Alumno> findAll() {
		// TODO Auto-generated method stub
		return alumnos;
	}
	
}
