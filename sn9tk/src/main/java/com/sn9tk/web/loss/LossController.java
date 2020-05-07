package com.sn9tk.web.loss;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loss")
public class LossController {
	@Autowired LossService lossService;
	
	@GetMapping("")
	public List<Loss> list(){
		return lossService.findAll();
	}
	@GetMapping("/{lossid}")
	public Loss detail(@PathVariable String lossid) {
		return lossService.findOne(lossid);
		
	}
}
