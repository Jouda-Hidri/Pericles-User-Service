package pericles.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pericles.userservice.api.VoteService;

@RestController
public class UserController {
	@Autowired
	VoteService voteService;
	@RequestMapping(value = "/user/{user}", method = RequestMethod.GET)
	public String vote(@PathVariable String user) {
		System.out.println("You are " + user);
		return "You are "+user+" and "+voteService.vote("Darth Vader");
	}
}
