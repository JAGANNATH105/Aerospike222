package com.Api.Aerospike.Service;

import com.Api.Aerospike.Model.Person;
import com.Api.Aerospike.Repository.PersonRepositoryIml;
//import com.restapi.Model.Person;
//import com.restapi.Repository.PersonRepositoryIml;
//import jakarta.inject.Inject;
//import jakarta.inject.Singleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceIml implements PersonService {
    @Autowired
    PersonRepositoryIml employeeRepository;

    @Override
    public String addPerson(Person person) {
        return employeeRepository.addPerson(person);


    }
   public List<Person> getAllPerson(){
        return employeeRepository.getAllPerson();
   }

    @Override
    public Person getPersonById(int id) {
        return employeeRepository.findById(id);
        //return get
    }

    @Override
    public String updatePerson(Person person, int id) {
        return employeeRepository.updatePerson(person, id);
    }
    public String deleteById(int id){
     return employeeRepository.deleteById(id);
    }

}
