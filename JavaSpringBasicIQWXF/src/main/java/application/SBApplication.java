package application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import application.AtChatUser.User;
import application.mongodb.UserRepository;

@SpringBootApplication
@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
public class SBApplication {

    public static void main(String[] args) {
        SpringApplication.run(SBApplication.class, args);
    }
    
    @Bean
    public static CommandLineRunner foo(MongoTemplate mt, UserRepository userRepository) {
    	return args-> {
//    		private UserRepository userRepository;
//    		public DBSeeder(UserRepository userRepository) {
//    			this.userRepository = userRepository;
//    		}
//    		@Override
//    		public void run(String... arg0) throws Exception {
//    			User rem = new User();
//    			this.userRepository.save(rem);
//    		}
    		
//    		User rem = new User();
//    		mt.save(rem, "AtChat");
    		
    		
    		
    	};
    }
}
