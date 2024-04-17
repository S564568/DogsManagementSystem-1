package com.saiTeja.DMS.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.saiTeja.DMS.Model.Dog;



@Repository
public interface DogRepository extends CrudRepository<Dog,Integer>{

}