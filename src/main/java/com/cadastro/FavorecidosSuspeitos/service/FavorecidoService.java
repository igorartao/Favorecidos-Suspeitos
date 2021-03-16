package com.cadastro.FavorecidosSuspeitos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro.FavorecidosSuspeitos.model.Favorecido;
import com.cadastro.FavorecidosSuspeitos.repository.FavorecidoRepository;

@Service
public class FavorecidoService {
	@Autowired
	FavorecidoRepository favorecidoRepository;

	public void deleteFavorecidoSuspeito(String nuCpfCnpj) {
		favorecidoRepository.deleteById(nuCpfCnpj);
	}

	public Favorecido getFavorecidoSuspeitoById(String nuCpfCnpj) {
		return favorecidoRepository.findById(nuCpfCnpj).get();
	}

	public List<Favorecido> listAllFavorecidosSuspeitos() {
		return favorecidoRepository.findAll();
	}

	public void saveFavorecidoSuspeito(Favorecido func) {
		favorecidoRepository.save(func);
	}
}
