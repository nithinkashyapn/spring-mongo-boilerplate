package code.nithin.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Permission {
    @Id
    public ObjectId _id;

    public String[] owners;

    public Permission(ObjectId _id, String[] owners) {
        this._id = _id;
        this.owners = owners;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String[] getOwners() {
        return owners;
    }

    public void setOwners(String[] owners) {
        this.owners = owners;
    }
}
