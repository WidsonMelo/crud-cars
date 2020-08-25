package com.widson.crudcars.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.widson.crudcars.model.Car;
import com.widson.crudcars.repository.CarRepository;

@RestController
@RequestMapping("/cars")
public class CarController {
	
	@Autowired
	private CarRepository carRepository;
	
	@GetMapping("/all")
	public List<Car> readAll() {
		return carRepository.findAll();	
	}
	
	// Faz a busca, se houver algum registro, retorna ele, caso contrário retorna o código 404 (não encontrado)
	@GetMapping("/id/{carId}")
	public ResponseEntity<Car> readById(@PathVariable Long carId) {
		Optional<Car> car = carRepository.findById(carId);
		if(car.isPresent()) {
			return ResponseEntity.ok(car.get());
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	// Transforma o json recebido no corpo em um objeto Car e cria no banco de dados
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Car create(@Valid @RequestBody Car car) {
		return carRepository.save(car);
	}
	
	// Faz a busca, se o elemento existir, atualiza, caso contrrário retorna 404
	// @Valid valida as regrasdos campos para ficar igual as definições do model (@size)
	@PutMapping("/id/{carId}")
	public ResponseEntity<Car> updateById(@Valid @PathVariable Long carId, @RequestBody Car car) {
		if (carRepository.existsById(carId)) {
			car.setId(carId);
			car = carRepository.save(car);
			return ResponseEntity.ok().body(car);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@RequestMapping("/{carId}")
	public ResponseEntity<Void> delete(@PathVariable Long carId){
		if (carRepository.existsById(carId)) {
			carRepository.deleteById(carId);
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
