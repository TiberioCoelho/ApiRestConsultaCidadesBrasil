package com.github.tiberiocoelho.citiesappcrud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.github.tiberiocoelho.citiesappcrud.entidade.PaisEntidade;
import com.github.tiberiocoelho.citiesappcrud.repository.PaisRepository;



@RestController
public class PaisController {
	
	@Autowired
	private PaisRepository repository;

	@GetMapping(path="/api/pais/{codigo}")
	public ResponseEntity<PaisEntidade> consulta(@PathVariable("codigo") Long codigo){
		return repository.findById(codigo)
				.map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping(path="/api/pais/salvar")
	public PaisEntidade salvar(@RequestBody PaisEntidade cities) {
		return repository.save(cities);
	}
}
