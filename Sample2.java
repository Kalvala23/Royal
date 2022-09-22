//Write a rule to get all the inactive users in SailPoint.

import java.util.List;

import sailpoint.api.SailPointContext;
import sailpoint.api.SailPointFactory;
import sailpoint.object.Identity;
import sailpoint.spring.SpringStarter;
import sailpoint.tools.GeneralException;

public class Sample2 {

	public static void main(String[] args) throws GeneralException {
		SpringStarter starter = new SpringStarter("iiqBeans");
		starter.start();

		SailPointContext context = SailPointFactory.createContext();

		List<Identity> ls = context.getObjects(Identity.class);

		for (Identity id : ls) {
			if (id.isInactive() == false) {
				System.out.println(id.getDisplayableName());
			}
		}
	}
}
