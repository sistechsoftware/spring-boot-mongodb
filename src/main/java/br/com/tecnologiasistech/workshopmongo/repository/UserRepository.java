package br.com.tecnologiasistech.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import br.com.tecnologiasistech.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{	
	
	
}
