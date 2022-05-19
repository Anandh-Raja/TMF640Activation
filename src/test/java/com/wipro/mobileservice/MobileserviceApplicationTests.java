package com.wipro.mobileservice;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.wipro.mobileservice.entities.MobileAccessPostRequest;
import com.wipro.mobileservice.entities.RelatedParty;
import com.wipro.mobileservice.entities.ServiceCharacteristic;
import com.wipro.mobileservice.entities.ServiceRelationship;
import com.wipro.mobileservice.entities.SupportingServiceCreatePostRequest;
import com.wipro.mobileservice.repository.MobileRepo;
import com.wipro.mobileservice.service.MobileService;

@SpringBootTest
class MobileserviceApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	private MobileService service;
	@MockBean
	private MobileRepo repo; 
	@MockBean
	private RelatedParty reporp;
	@Test
	public void saveMobileTest() {
		MobileAccessPostRequest m=new MobileAccessPostRequest();
		when(repo.save(m)).thenReturn(m);
		assertEquals(m,service.saveMobile(m));
	}
	@Test
	public void saveRelatedPartyTest() {
		RelatedParty rp=new RelatedParty();
		when(reporp.saveRelated(rp)).thenReturn(rp);
		assertEquals(rp,service.saveRelatedParty(rp));
	}
	
}
