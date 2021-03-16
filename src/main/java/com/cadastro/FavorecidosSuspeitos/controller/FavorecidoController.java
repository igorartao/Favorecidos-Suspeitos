package com.cadastro.FavorecidosSuspeitos.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.FavorecidosSuspeitos.model.Favorecido;
import com.cadastro.FavorecidosSuspeitos.service.FavorecidoService;

@RestController
@RequestMapping("/api/favorecidos")
public class FavorecidoController {
	@Autowired
	FavorecidoService favorecidoService;

	@GetMapping("")
	public List<Favorecido> list() {
		return favorecidoService.listAllFavorecidosSuspeitos();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Favorecido> get(@PathVariable String id) {
		try {
			Favorecido favorecido = favorecidoService.getFavorecidoSuspeitoById(id);
			return new ResponseEntity<Favorecido>(favorecido, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Favorecido>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/")
	public void add(@RequestBody Favorecido favorecido) {
		favorecidoService.saveFavorecidoSuspeito(favorecido);
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Favorecido favorecido, @PathVariable String id) {

		try {
			favorecido.setNuCpfCnpj(id);
			favorecidoService.saveFavorecidoSuspeito(favorecido);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		favorecidoService.deleteFavorecidoSuspeito(id);
	}

}
