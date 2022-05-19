package com.example.PersistanceAPI.vo;
import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Document;

import com.example.PersistanceAPI.model.ServiceSpecification;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection="MobileService")
public class Root{
    public String name;
    public String description;
    public String state;
    public ServiceSpecification serviceSpecification;
    public ArrayList<RelatedPartyDto> relatedParty;
    public ArrayList<ServiceCharacteristic> serviceCharacteristic;
    public ArrayList<SupportingServiceDto> supportingServiceDto;
}
