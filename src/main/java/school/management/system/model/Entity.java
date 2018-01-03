package school.management.system.model;

import school.management.system.exception.InvalidIdException;
import school.management.system.util.impl.IdGenerator;

public abstract class Entity implements IdGenerator {

    private String id;

    // 1st construct
    public Entity() {
    	id = generateId();
    }

    public Entity(String id) {
        validateId(id);
    }

    // Id should not be shorter than 4 symbols. It's because ID has 3 symbols (letters) by default + it should get at least 1-digit random integer. The following method performs this check
    private void validateId(String id) {
        if(id == null || id.length() < 4) throw new InvalidIdException();
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}