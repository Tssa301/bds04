package com.tssa301.bds04.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tssa301.bds04.entities.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

}
