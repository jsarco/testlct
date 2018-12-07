package de.lct.prime.user.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.lct.prime.user.entities.User;

@RestController
@RequestMapping("/")
public class UserController {

	@RequestMapping("/users")
	public List<User> getAllUsers() {
		List<User> users = Arrays.asList(new User(1,"Juan", "Perez"), new User(2,"Pepe", "Sand"));
		return users;
	}
}
