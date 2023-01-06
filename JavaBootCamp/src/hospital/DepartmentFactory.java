package hospital;

public class DepartmentFactory {
	
	public static Department getDepartmentInstance(String departName) {
		
		if(departName.equals("OPD")) {
			return OPD.getInstance();
		}
		return null;
	}

}
