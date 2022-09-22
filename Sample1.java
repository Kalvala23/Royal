//Write a rule to find out assigned roles and detected roles for the particular Identity have.

import java.util.List;

import sailpoint.api.SailPointContext;
import sailpoint.api.SailPointFactory;
import sailpoint.object.Bundle;
import sailpoint.object.Identity;
import sailpoint.spring.SpringStarter;
import sailpoint.tools.GeneralException;

public class Sample1 {
	public static void main(String[] args) throws GeneralException 
	{
		SpringStarter starter = new SpringStarter("iiqBeans");
		starter.start();
		SailPointContext context = SailPointFactory.createContext();
		
		Identity id = context.getObject(Identity.class, "Ashok");

		List<Bundle> assign1 = id.getAssignedRoles();
		for(Bundle b : assign1) 
		{
			System.out.println(b.getDisplayableName());
		}
		
		List<Bundle> assign2 = id.getDetectedRoles();
		System.out.println(assign2);
		
	}

}
