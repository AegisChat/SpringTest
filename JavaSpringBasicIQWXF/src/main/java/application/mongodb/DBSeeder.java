//package application.mongodb;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DBSeeder implements CommandLineRunner{
//
//	private UserRepository userRepository;
//	
//	public DBSeeder(UserRepository userRepository) {
//		this.userRepository = userRepository;
//	}
//	@Override
//	public void run(String... arg0) throws Exception {
//		User rem = new User();
//		this.userRepository.save(rem);
//	}
//
//
//}
