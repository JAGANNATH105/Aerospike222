package com.Api.Aerospike.Service;

import com.Api.Aerospike.Model.Person;
//import com.restapi.Model.Person;
//import jakarta.inject.Singleton;

import java.util.List;

//@Singleton
public interface PersonService {
   public String addPerson(Person person);
   public List<Person> getAllPerson();
  public Person getPersonById(int id);
  public String updatePerson(Person person , int id);
  public String deleteById(int id);

}


