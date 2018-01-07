package application.mongodb;

import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@GetMapping("/all")
	public List<User> getAll(){
		List<User> users = this.userRepository.findAll();
		return users;
	}
	
	@PostMapping("/all")
	public boolean foo(@RequestBody User user) {
		
		return false;
	}
}