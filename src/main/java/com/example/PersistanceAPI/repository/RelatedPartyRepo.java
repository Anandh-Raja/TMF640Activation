package com.example.PersistanceAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.PersistanceAPI.vo.RelatedPartyDto;

@Repository
public interface RelatedPartyRepo extends CrudRepository<RelatedPartyDto,Integer>{

}
