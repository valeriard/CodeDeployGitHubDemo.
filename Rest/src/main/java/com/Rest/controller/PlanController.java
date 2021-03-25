package com.Rest.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.Rest.model.Plan;


import com.Rest.service.PlanService;

@RestController
@RequestMapping(value = "rest/plan/")
public class PlanController  {

	
	
		@Autowired
		private PlanService planservice;
		
		@PostMapping(value="anadir")
		public Plan agregarplan(@RequestBody Plan plans)
		{
			return planservice.adicionarplan(plans);
		}
		
		@PutMapping(value="modificar")
		public Plan modificar(@RequestBody Plan plan)
		{
			return planservice.modificarplan(plan);
		}
		
		@DeleteMapping(value="eliminar")
		public void eliminar(@RequestParam Integer id)
		{
			planservice.eliminarplan(id);
		}
	

}
