package net.engineeringdigest.journalApp.repository;

import net.engineeringdigest.journalApp.entity.UserEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends MongoRepository<UserEntry, ObjectId> {

    UserEntry findByUserName(String userName);
}
