package application.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import application.AtChatUser.User;

@Repository
public interface UserRepository extends MongoRepository<User, Integer>{
	
	
	User findByName(String name);

}
