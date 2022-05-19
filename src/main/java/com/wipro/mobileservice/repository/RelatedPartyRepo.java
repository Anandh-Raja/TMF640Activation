package com.wipro.mobileservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wipro.mobileservice.entities.RelatedParty;

@Repository
public interface RelatedPartyRepo extends MongoRepository<RelatedParty,Long>{

	Object saveRelated(RelatedParty rp);

}
