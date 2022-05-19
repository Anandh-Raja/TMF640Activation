package com.example.PersistanceAPI;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.PersistanceAPI.model.MobileAccessPostRequest;
import com.example.PersistanceAPI.repository.PersistanceRepository;
import com.example.PersistanceAPI.repository.RelatedPartyRepo;
import com.example.PersistanceAPI.repository.SupportingServiceRepo;
import com.example.PersistanceAPI.service.PersistanceService;
import com.example.PersistanceAPI.vo.RelatedPartyDto;
import com.example.PersistanceAPI.vo.SupportingServiceDto;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	private PersistanceService ps;
	
	@MockBean
	private PersistanceRepository prepo;
	@MockBean
	private RelatedPartyRepo rprepo;
	@MockBean
	private SupportingServiceRepo ssrepo;
	@Test 
	public void saveMobileTest() {
		MobileAccessPostRequest mrp=new MobileAccessPostRequest();
		when(prepo.save(mrp)).thenReturn(mrp);
		assertEquals(mrp,ps.createNewMobile(mrp));
	}
	@Test
	public void saveRelatedPartytest() {
		MobileAccessPostRequest mrp=new MobileAccessPostRequest();
		RelatedPartyDto rp=new RelatedPartyDto();
		when(rprepo.save(rp)).thenReturn(rp);
		assertEquals(rp,ps.saveRelatedParty(mrp));
	}
	@Test
	public void saveSupportServiceTest() {
		MobileAccessPostRequest mrp=new MobileAccessPostRequest();
		SupportingServiceDto ss=new SupportingServiceDto();
		when(ssrepo.save(ss)).thenReturn(ss);
		assertEquals(ss,ps.saveSupportingService(mrp));
	}
	@Test
	public void saveGetMobileTest() {
		MobileAccessPostRequest mrp=new MobileAccessPostRequest();
		Long id=1000L;
		when(prepo.findById(id)).thenReturn(mrp);
		assertEquals(mrp,ps.saveSupportingService(mrp));
	}
}
