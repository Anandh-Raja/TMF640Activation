package com.example.PersistanceAPI.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection="mobile-api")
public class Root {
	@Id
	private int id;
    private String name;
    private String description;
    private String state;
    private ServiceSpecification serviceSpecification;
    private ArrayList<RelatedParty> relatedParty;
    private ArrayList<ServiceCharacteristic> serviceCharacteristic;
    private ArrayList<SupportingService> supportingService;
}
