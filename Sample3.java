//Write a rule to find all the users which are active in SailPoint and Display the user as lastname.firstname.

import java.util.List;

import sailpoint.api.SailPointContext;
import sailpoint.api.SailPointFactory;
import sailpoint.object.Identity;
import sailpoint.spring.SpringStarter;
import sailpoint.tools.GeneralException;

public class Sample3 {

	public static void main(String[] args) throws GeneralException {

		SpringStarter starter = new SpringStarter("iiqBeans");
		starter.start();

		SailPointContext context = SailPointFactory.createContext();

		List<Identity> list = context.getObjects(Identity.class);
		for (Identity id : list) {
			if (id.isInactive() == false) {
				System.out.println(id.getLastname() + " . " + id.getFirstname());
			}
		}
	}
}