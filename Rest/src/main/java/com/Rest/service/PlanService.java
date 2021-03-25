package com.Rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.Rest.model.Plan;
import com.Rest.repository.PlanDao;


@Service
public class PlanService {

	@Autowired
	private PlanDao planDao;
	
	public List<Plan> verplan(){
		return planDao.findAll();		
	}
	
	public  Plan adicionarplan(@RequestBody Plan plans) {
		return planDao.save(plans);
	}
	
	public Plan modificarplan(@RequestBody Plan plans){
			return planDao.save(plans);
	}
	
	public void eliminarplan(@RequestParam Integer id) {
		planDao.deleteById(id);
	}
}
