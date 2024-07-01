package com.devsuperior.workshopmongo.repositories;

import com.devsuperior.workshopmongo.models.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
