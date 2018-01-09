package ctx;

import org.junit.Assert;
import org.junit.Test;

import school.management.system.ctx.SchoolRegistry;
import school.management.system.model.School;

public class SchoolRegistryTest {
	
	@Test
	public void registryTest() {
		School first = new School("First");
		School second = new School("Second");
		School third = new School("Third");
		
		SchoolRegistry.add(first);
		SchoolRegistry.add(second);
		SchoolRegistry.add(third);
		
		Assert.assertNotNull(SchoolRegistry.getSchoolObjectList());
		Assert.assertEquals(SchoolRegistry.getSchoolObjectList().get(2).toString(), "Third");
	}

}