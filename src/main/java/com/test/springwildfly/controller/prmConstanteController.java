package com.test.springwildfly.controller;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.springwildfly.srv.PrmConstanteService;
import com.test.springwildfly.jpa.prmConstante;

@RestController
@RequestMapping("/prm")
@CrossOrigin("*")

public class prmConstanteController {

	@Autowired
	PrmConstanteService prmConstanteService;


	public prmConstanteController() {

		System.out.println(" ############# : sortie de type constante  la methode teamWeb 1231456 ");
	}

	@GetMapping("/pcs")
	public List<prmConstante> listConstante() {
		return prmConstanteService.getList();
	}
}
