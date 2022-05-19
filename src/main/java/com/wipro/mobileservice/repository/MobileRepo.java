package com.wipro.mobileservice.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wipro.mobileservice.entities.MobileAccessPostRequest;

@Repository
public interface MobileRepo extends MongoRepository<MobileAccessPostRequest,Long> {

}
