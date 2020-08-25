package com.widson.crudcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.widson.crudcars.model.Car;

@Repository("carRepository")
public interface CarRepository extends JpaRepository<Car, Long>{
	List<Car> findByColor (String color);
	List<Car> findByYear (Integer year);
}
