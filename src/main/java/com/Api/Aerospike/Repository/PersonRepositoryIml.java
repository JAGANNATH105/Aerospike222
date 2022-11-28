package com.Api.Aerospike.Repository;

import com.Api.Aerospike.Model.Person;
import com.Api.Aerospike.configuration.AerospikeConfigurationProperties;
import com.aerospike.mapper.tools.AeroMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Properties;

@Repository
public class PersonRepositoryIml implements PersonRepository {
    @Autowired
    AeroMapper mapper;

@Autowired
    AerospikeConfigurationProperties aerospikeConfigurationProperties;


    @Override

    public String addPerson(Person person) {
       mapper.save(person);
        return "Person saved successfully..!="+person.getId();
    }
    @Override
    public List<Person> getAllPerson(){

       return mapper.scan(Person.class);

    }
@Override
    public Person findById(int id) {


        return mapper.read(Person.class, id);

    }
    @Override
    public String updatePerson(Person person, int id) {
        Person p = mapper.read(Person.class,id);
           // p.setId(person.getId());
            p.setName(person.getName());
            p.setEmail(person.getEmail());
            p.setJoiningDate(person.getJoiningDate());
            p.setSal(person.getSal());
            p.setCategories(person.getCategories());


            mapper.save(p);
            return "Person Updated..!="+p.getId();
    }
    @Override
    public String deleteById(int id) {
        mapper.delete(Person.class,id);
        return "Person Deleted By Id..!="+id;

    }
}
