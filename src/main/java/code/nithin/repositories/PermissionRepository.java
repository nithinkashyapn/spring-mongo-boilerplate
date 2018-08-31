package code.nithin.repositories;

import code.nithin.models.Permission;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PermissionRepository extends MongoRepository<Permission, String>{
    Permission findBy_id(ObjectId _id);
}
