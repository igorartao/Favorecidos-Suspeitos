package com.cadastro.FavorecidosSuspeitos.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cadastro.FavorecidosSuspeitos.model.Favorecido;

public interface FavorecidoRepository extends MongoRepository<Favorecido, String> {

}
