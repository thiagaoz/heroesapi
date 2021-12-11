package com.thiagao.heroesapi.repository;


import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.thiagao.heroesapi.document.Heroes;

@EnableScan
public interface HeroesRepository extends CrudRepository<Heroes, String>{
}
