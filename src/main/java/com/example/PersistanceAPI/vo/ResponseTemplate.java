package com.example.PersistanceAPI.vo;

import java.util.ArrayList;

import com.example.PersistanceAPI.model.MobileAccessPostRequest;
import com.example.PersistanceAPI.model.RelatedParty;
import com.example.PersistanceAPI.model.ServiceCharacteristic;
import com.example.PersistanceAPI.model.ServiceSpecification;
import com.example.PersistanceAPI.model.SupportingService;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplate {
	
	private MobileAccessPostRequest mobile;
	private ServiceSpecification serviceSpecification;
    public ServiceSpecification getServiceSpecification() {
		return serviceSpecification;
	}

	public void setServiceSpecification(ServiceSpecification serviceSpecification) {
		this.serviceSpecification = serviceSpecification;
	}

	public ArrayList<RelatedParty> getRelatedParty() {
		return relatedParty;
	}

	public void setRelatedParty(ArrayList<RelatedParty> relatedParty) {
		this.relatedParty = relatedParty;
	}

	public ArrayList<ServiceCharacteristic> getServiceCharacteristic() {
		return serviceCharacteristic;
	}

	public void setServiceCharacteristic(ArrayList<ServiceCharacteristic> serviceCharacteristic) {
		this.serviceCharacteristic = serviceCharacteristic;
	}

	public ArrayList<SupportingService> getSupportingService() {
		return supportingService;
	}

	public void setSupportingService(ArrayList<SupportingService> supportingService) {
		this.supportingService = supportingService;
	}

	private ArrayList<RelatedParty> relatedParty;
    private ArrayList<ServiceCharacteristic> serviceCharacteristic;
    private ArrayList<SupportingService> supportingService;

	public MobileAccessPostRequest getMobile() {
		return mobile;
	}

	public void setMobile(MobileAccessPostRequest mobile) {
		this.mobile = mobile;
	}
}
