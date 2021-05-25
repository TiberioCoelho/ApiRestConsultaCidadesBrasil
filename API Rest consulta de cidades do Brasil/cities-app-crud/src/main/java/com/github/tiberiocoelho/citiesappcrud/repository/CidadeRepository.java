package com.github.tiberiocoelho.citiesappcrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.github.tiberiocoelho.citiesappcrud.entidade.CidadeEntidade;

public interface CidadeRepository extends CrudRepository<CidadeEntidade, Long> {

}
