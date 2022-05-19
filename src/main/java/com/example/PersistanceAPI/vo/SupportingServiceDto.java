package com.example.PersistanceAPI.vo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.example.PersistanceAPI.model.ServiceSpecification;
import com.example.PersistanceAPI.model.StateEnum;

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
@Document(collection="supportingserv")
public class SupportingServiceDto{
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StateEnum getState() {
		return state;
	}
	public void setState(StateEnum state) {
		this.state = state;
	}
	public ServiceSpecification getServiceSpecification() {
		return serviceSpecification;
	}
	public void setServiceSpecification(ServiceSpecification serviceSpecification) {
		this.serviceSpecification = serviceSpecification;
	}
	
	public String name;
    public StateEnum state;
    public ServiceSpecification serviceSpecification;
    public List<ServiceCharacteristic> serviceCharacteristic;
	public List<ServiceCharacteristic> getServiceCharacteristic() {
		return serviceCharacteristic;
	}
	
	public void setServiceCharacteristic(List<ServiceCharacteristic> serviceCharacteristic) {
		// TODO Auto-generated method stub
		this.serviceCharacteristic = serviceCharacteristic;
	}
}
