package application.mongodb;

import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.AtChatUser.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private UserRepository userRepository;

	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@PostMapping("/createUser")
	public boolean createUser(@RequestBody User user, MongoTemplate mt) {
	    if(mt.find(query, entityClass)(user.) == false) {//email is unique
	    	return true;
	    } else {
	    	return false;
	    	}
	    }
	
	//public 
}
