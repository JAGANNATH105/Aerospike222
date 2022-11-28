package com.Api.Aerospike.Controller;

import com.Api.Aerospike.Model.Person;
import com.Api.Aerospike.Service.PersonService;
//import com.restapi.Model.Person;
//import com.restapi.Service.PersonService;
//import io.micronaut.http.MediaType;
//import io.micronaut.http.annotation.*;
//import io.micronaut.security.annotation.Secured;
//import io.micronaut.security.rules.SecurityRule;
//import io.swagger.v3.oas.annotations.tags.Tag;
//import jakarta.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/Person")
public class PersonController {

    @Autowired
    PersonService employeeService;


    @PostMapping(value = "/add")
    public String addPerson(@RequestBody  Person person){
         return employeeService.addPerson(person);
    }



    @GetMapping(value = "/GetallPerson")
    public List<Person> getAllPerson(){
        return employeeService.getAllPerson();
    }



    @GetMapping(value = "/getperson/{id}")
    public Person getPersonById(@PathVariable("id") int id){
        return employeeService.getPersonById(id);

    }
    //@Transactional
    @PutMapping(value = "/update/{id}")
    public String updatePerson(@RequestBody Person person , @PathVariable("id") int id ){
       return employeeService.updatePerson(person, id);

    }
    @DeleteMapping(value = "/delete/{id}")
    public String deleteById(int id){
        return employeeService.deleteById(id);
    }
}
