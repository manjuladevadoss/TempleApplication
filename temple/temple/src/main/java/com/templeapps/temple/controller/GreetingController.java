package com.templeapps.temple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sampleapp.dto.SortedProducts;
import com.templeapps.temple.constants.StatusNames;
import com.templeapps.temple.model.Priest;
import com.templeapps.temple.service.PriestService;

@RestController
public class GreetingController {
		
@Autowired
PriestService priestService;
	@GetMapping("/greeting")
	String getIntitalMethod(@RequestParam(value="name", defaultValue="temple") String name) {
		return "welcome" + name;
	}

	@GetMapping("/greeting1")
	String getSecondMethod(@RequestParam(value="name", defaultValue="welcome to ") String name) {
		return "welcome to God " + StatusNames.Durga;
	}
	
	@RequestMapping(value = "/addpriest", method = RequestMethod.POST)
	public @ResponseBody Priest addPriestInfo(@RequestBody Priest p) {
		System.out.println("name : " + p.getName());
		priestService.addPriestInfo(p);
		return p;
	}
	
	@RequestMapping(value = "/id", method = RequestMethod.GET)
    public  @ResponseBody Priest  getPriestById(@PathVariable int id) {
        return priestService.findById(id);
    }
	
	@GetMapping("/sort/price")  
	private ResponseEntity<SortedProducts[]> sorted_books()   
	{  
		
		try {
			System.out.println("insideilsort/price.1");
	       //  SortedProducts[] ans=new SortedProducts[data.length()];
			  SortedProducts[] ans=new SortedProducts[10];
	         for(int i=0;i<ans.length;i++) {
	        		System.out.println(ans[i]);
	         }
	
	         

		    return new ResponseEntity<SortedProducts[]>(ans, HttpStatus.OK);
		    
		}catch(Exception E)
			{
   	System.out.println("Error encountered : "+E.getMessage());
    return new ResponseEntity<SortedProducts[]>(HttpStatus.NOT_FOUND);
			}
		
	}  

}
