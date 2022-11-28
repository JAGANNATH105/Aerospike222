package com.Api.Aerospike.Repository;

import com.Api.Aerospike.Model.Person;
//import com.restapi.Model.Person;

import java.util.List;


public interface PersonRepository {
 public String addPerson(Person person);


 public List<Person> getAllPerson();

 public Person findById(int id);

 public String updatePerson(Person person, int id);
 public String deleteById(int id);
}


