package com.example.PersistanceAPI.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.PersistanceAPI.model.MobileAccessPostRequest;
import com.example.PersistanceAPI.model.RelatedParty;
import com.example.PersistanceAPI.model.ServiceCharacteristic;
import com.example.PersistanceAPI.model.ServiceRelationship;
import com.example.PersistanceAPI.model.ServiceSpecification;
import com.example.PersistanceAPI.model.StateEnum;
import com.example.PersistanceAPI.model.SupportingServiceCreatePostRequest;
import com.example.PersistanceAPI.repository.PersistanceRepository;
import com.example.PersistanceAPI.repository.RelatedPartyRepo;
import com.example.PersistanceAPI.repository.SupportingServiceRepo;
import com.example.PersistanceAPI.vo.RelatedPartyDto;
import com.example.PersistanceAPI.vo.ResponseTemplate;
import com.example.PersistanceAPI.vo.SupportingServiceDto;
import com.example.PersistanceAPI.model.Root;

@Service
public class PersistanceService {
	@Autowired
private PersistanceRepository repo;
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private PersistanceRepository prepo;
	@Autowired
	private RelatedPartyRepo rprepo;
	@Autowired
	private SupportingServiceRepo ssrepo;

	public ResponseTemplate getMobile(Long id) {
		// TODO Auto-generated method stub
		ResponseTemplate vo=new ResponseTemplate();
		Optional<MobileAccessPostRequest> m=repo.findById(id);
		
		MobileAccessPostRequest mobile=restTemplate.getForObject("http://localhost:9001/mobileservice/", MobileAccessPostRequest.class);
		//vo.setMobile(m.get().getClass(0));
		vo.setMobile(mobile);
		return vo;
	}

	public MobileAccessPostRequest createNewMobile(MobileAccessPostRequest m) {
		// TODO Auto-generated method stub
		return repo.save(m);
	}

	public ResponseTemplate getMobile(ObjectId id) {
		// TODO Auto-generated method stub
		ResponseTemplate vo=new ResponseTemplate();
		Optional<MobileAccessPostRequest> m=repo.findById(id);
		
		MobileAccessPostRequest mobile=restTemplate.getForObject("http://localhost:9001/mobileservice/", MobileAccessPostRequest.class);
		//vo.setMobile(m.get().getClass(0));
		vo.setMobile(mobile);
		return vo;
	}
	public void saveMobileService(MobileAccessPostRequest m) {
		MobileAccessPostRequest mobileService=new MobileAccessPostRequest();
		List<SupportingServiceCreatePostRequest> ss=m.getSupportingService();
		String name=ss.get(0).getName();
		String desp=ss.get(0).getDescription();
		StateEnum state=ss.get(0).getState();
		List<RelatedParty> rp=ss.get(0).getRelatedParty();
		List<ServiceCharacteristic> servChar=ss.get(0).getServiceCharacteristic();
		List<ServiceRelationship> sr=ss.get(0).getServiceRelationship();
		ServiceSpecification servSpec=ss.get(0).getServiceSpecification();
		mobileService.setDescription(desp);
		mobileService.setName(name);
		mobileService.setState(state);
		mobileService.serviceCharacteristic(servChar);
		mobileService.setRelatedParty(rp);
		mobileService.setServiceSpecification(servSpec);
		mobileService.serviceRelationship(sr);
		prepo.save(mobileService);	
	}
	public void saveRelatedParty(MobileAccessPostRequest m) {
		RelatedPartyDto rpdto=new RelatedPartyDto();
		List<RelatedParty> rp=m.getRelatedParty();
		String id=rp.get(0).getId();
		String name=rp.get(0).getName();
		String roll=rp.get(0).getRole();
		rpdto.setId(id);
		rpdto.setName(name);
		rpdto.setRole(roll);
		rprepo.save(rpdto);
	}
	public void saveSupportingService(MobileAccessPostRequest m) {
		SupportingServiceDto ssdto=new SupportingServiceDto();
		String name=m.getSupportingService().get(0).getName();
		StateEnum state=m.getSupportingService().get(0).getState();
		ServiceSpecification servSpec=m.getSupportingService().get(0).getServiceSpecification();
		List<ServiceCharacteristic> servChar=m.getSupportingService().get(0).getServiceCharacteristic();
		ssdto.setName(name);
		ssdto.setState(state);
		ssdto.setServiceSpecification(servSpec);
		//ssdto.setServiceCharacteristic(servChar);
		ssrepo.save(ssdto);
	}

}
 