package com.Api.Aerospike.Repository;


import com.Api.Aerospike.Model.Emp;
import org.springframework.data.aerospike.repository.AerospikeRepository;


public interface EmployeeRepository extends AerospikeRepository<Emp, Integer> {
}