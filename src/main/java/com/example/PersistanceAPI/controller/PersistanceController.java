package com.example.PersistanceAPI.controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PersistanceAPI.model.MobileAccessPostRequest;
import com.example.PersistanceAPI.service.PersistanceService;
import com.example.PersistanceAPI.vo.ResponseDto;
import com.example.PersistanceAPI.vo.ResponseTemplate;
import com.example.PersistanceAPI.vo.Value;

@RestController
@RequestMapping("/servicecall")
public class PersistanceController {
	@Autowired
	private PersistanceService service;
	@GetMapping("/{id}")
	public ResponseTemplate getMobile(@PathVariable("id") ObjectId id) {
		return service.getMobile(id);
	}
	@PostMapping("/")
	public ResponseTemplate createData(@RequestBody MobileAccessPostRequest m) {
		 MobileAccessPostRequest ms=service.createNewMobile(m);
		 ResponseTemplate rt=new ResponseTemplate();
		 rt.setMobile(ms);
		 return rt;
	}
	@PostMapping("savemobile")
	public ResponseEntity<?> mobileService(@RequestBody MobileAccessPostRequest m){
		ResponseDto  response=new ResponseDto();
		try {
		service.saveMobileService(m);
		response.setMsg("Data saved succeed");
		response.setResult(Value.CREATED);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			response.setErr(e);
			response.setMsg("Data Save Failed");
			response.setResult(Value.NOT_FOUND);
			
		}
		return  ResponseEntity.ok(response);
	}
	@PostMapping("saveRelated")
	public ResponseEntity<?> Related(@RequestBody MobileAccessPostRequest m){
		ResponseDto  response=new ResponseDto();
		try {
		service.saveRelatedParty(m);
		response.setMsg("Data saved succeed");
		response.setResult(Value.CREATED);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			response.setErr(e);
			response.setMsg("Data Save Failed");
			response.setResult(Value.NOT_FOUND);
			
		}
		return  ResponseEntity.ok(response);
	}
	@PostMapping("savess")
	public ResponseEntity<?> SupportingService(@RequestBody MobileAccessPostRequest m){
		ResponseDto  response=new ResponseDto();
		try {
		service.saveSupportingService(m);
		response.setMsg("Data saved succeed");
		response.setResult(Value.CREATED);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			response.setErr(e);
			response.setMsg("Data Save Failed");
			response.setResult(Value.NOT_FOUND);
			
		}
		return  ResponseEntity.ok(response);
	}
	

}
