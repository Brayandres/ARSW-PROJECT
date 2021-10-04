package edu.eci.arsw.project.controllers;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/project")
public class ProjectAPIController {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> defaultGet(){
		try {
			return new ResponseEntity<>("ARSW - PROJECT:\n¡Responde o Lárgate!", HttpStatus.ACCEPTED);
		} catch (Exception e) {
			Logger.getLogger(ProjectAPIController.class.getName()).log(Level.SEVERE, null, e);
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
}