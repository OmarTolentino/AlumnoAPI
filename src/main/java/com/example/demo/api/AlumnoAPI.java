package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Alumno;
import com.example.demo.repository.AlumnoRepositorio;

@RestController
@RequestMapping("api/v1/alumnos")
public class AlumnoAPI {
	
		@Autowired
		private AlumnoRepositorio alumnoRepository;
		
		@PostMapping
		public Alumno crearAlumno(Alumno a) {			
			return alumnoRepository.add(a);
		}
		
		@GetMapping
		public List<Alumno> getAll(){
			return alumnoRepository.findAll();
		}
		
		
		@PostMapping
		public Alumno add(@RequestBody Alumno alumno) {
			alumnoRepository.add(alumno);
			return alumno;
		}
		
		
}
