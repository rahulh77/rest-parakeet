package com.rest.parakeet.pkapp.repositories;
import com.rest.parakeet.pkapp.models.Bird;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BirdRepository extends MongoRepository <Bird, String> {
    Bird findBy_id(ObjectId _id);
}
