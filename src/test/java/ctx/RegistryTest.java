package ctx;

import org.junit.Assert;
import org.junit.Test;

import school.management.system.ctx.Registry;
import school.management.system.model.School;

public class RegistryTest {
	
	@Test
	public void registryTest() {
		School first = new School("First");
		School second = new School("Second");
		School third = new School("Third");
		
		Registry.add(first);
		Registry.add(second);
		Registry.add(third);
		
		Assert.assertNotNull(Registry.getSchoolObjectList());
		Assert.assertEquals(Registry.getSchoolObjectList().get(2).toString(), "Third");
	}

}