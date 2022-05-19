package com.example.PersistanceAPI.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.PersistanceAPI.model.MobileAccessPostRequest;

@Repository
public interface PersistanceRepository extends MongoRepository<MobileAccessPostRequest,Long>{

	Optional<MobileAccessPostRequest> findById(ObjectId id);

}
