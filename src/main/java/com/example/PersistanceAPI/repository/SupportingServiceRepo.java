package com.example.PersistanceAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.PersistanceAPI.vo.SupportingServiceDto;

@Repository
public interface SupportingServiceRepo extends CrudRepository<SupportingServiceDto,Integer> {

}
