package com.example.demo.resource;

import java.util.*;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.Apost;
import com.example.demo.repositories.ApostRepository;



@RestController
public class ApostResource {

	@Autowired
	private ApostRepository _apostRepository;
	
    @RequestMapping(value = "/apost", method = RequestMethod.GET)
    public Collection<Apost> Get(){
    	return _apostRepository.findAll();
    }
   
    @RequestMapping(value = "/apost/{id}", method = RequestMethod.GET)
    public ResponseEntity<Apost> GetById(@PathVariable(value = "id")long id)
    {
      Optional<Apost>apost = _apostRepository.findById((int) id);
      if(apost.isPresent())
    	  return new ResponseEntity<Apost>(apost.get(),HttpStatus.OK);
      else
    	  return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @RequestMapping(value = "/apost", method = RequestMethod.POST)
    public Apost Post(@Valid @RequestBody Apost apost)
    {
    	return _apostRepository.save(apost);
    }
    @RequestMapping(value = "/apost/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Apost> Put(@PathVariable(value = "id")long id, @Valid @RequestBody Apost newApost)
    {
    	Optional<Apost> oldApost = _apostRepository.findById((int) id);
    	if (oldApost.isPresent()) {
    		Apost  apost = oldApost.get();
    		
    		_apostRepository.save(apost);
    		return new ResponseEntity<Apost>(apost, HttpStatus.OK);
    	}
    	else 
    		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    	}
    @RequestMapping(value = "/apost/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> Delete(@PathVariable(value = "id")long id)
    {
	Optional<Apost>apost = _apostRepository.findById((int) id);
	if(apost.isPresent()) {
		_apostRepository.delete(apost.get());
		return new ResponseEntity<>(HttpStatus.OK);
	}
	else
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
}   
    