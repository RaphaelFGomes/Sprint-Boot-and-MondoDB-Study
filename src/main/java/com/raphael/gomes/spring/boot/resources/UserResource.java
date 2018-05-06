package com.raphael.gomes.spring.boot.resources;

import java.util.List;
import java.util.stream.Collectors;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raphael.gomes.spring.boot.domain.User;
import com.raphael.gomes.spring.boot.dto.UserDTO;
import com.raphael.gomes.spring.boot.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	UserService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<UserDTO>> findAll() {
		List<User> listUser = service.findAll();	
		List<UserDTO> listUserDTO = listUser.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok(listUserDTO);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<UserDTO> findById(@PathVariable String id) {
		User obj = service.findById(id);		
		return ResponseEntity.ok().body(new UserDTO(obj));
	}

}
