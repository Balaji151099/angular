package com.angular;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 
 

 

@RestController
@RequestMapping(value = "/angular")
public class AngularController {
	  Logger log=Logger.getLogger(AngularControllerController.class);
	@Autowired
	AngularService as;
	

	@PostMapping(value = "/PostDirec")
	public String postEmps(@RequestBody List<Angular> w) throws AgeException{
		return as.postEmps(w);

	}
	@GetMapping(value = "/GetBelow")
	public List<Angular> getBage() {
		return as.getBage();

	}
	
	

}

