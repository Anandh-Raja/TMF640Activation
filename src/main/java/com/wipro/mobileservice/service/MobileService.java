package com.wipro.mobileservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.mobileservice.entities.MobileAccessPostRequest;
import com.wipro.mobileservice.entities.RelatedParty;
import com.wipro.mobileservice.repository.MobileRepo;
import com.wipro.mobileservice.repository.RelatedPartyRepo;



@Service
public class MobileService {
	@Autowired
	private MobileRepo repo;
	@Autowired
	private RelatedPartyRepo reporp;

	public MobileAccessPostRequest saveMobile(MobileAccessPostRequest newmobile) {
		// TODO Auto-generated method stub
		return repo.save(newmobile);
	}

	public Optional<MobileAccessPostRequest> findMobileById(Long mobileid) {
		// TODO Auto-generated method stub
		return repo.findById(mobileid);
	}

	public Object saveRelatedParty(RelatedParty rp) {
		// TODO Auto-generated method stub
		return reporp.saveRelated(rp);
	}

}
