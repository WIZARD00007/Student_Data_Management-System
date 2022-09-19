package com.akshay.webApp;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



public interface AlienRepo extends CrudRepository<Alien,Integer>
{
	
List<Alien> findByName(String name);
List<Alien> findByIdGreaterThan(int id);

@Query("from Alien where Name=?1 order by id")
List<Alien> findByNameSorted(String name);

}
