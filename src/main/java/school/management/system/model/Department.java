package school.management.system.model;

import school.management.system.util.impl.IdGenerator;

public abstract class Department extends Entity {

	@Override
	public String generateId() {
		return IdGenerator.DEPARTMENT_ID_PREIFX + IdGenerator.random.nextInt(IdGenerator.BOUND);
	}
}
