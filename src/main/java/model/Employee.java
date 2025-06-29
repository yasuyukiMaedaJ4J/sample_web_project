package model;

public class Employee {
	private String name;
	private String email;

	public Employee(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public boolean isNullCheck() {
		if (name != null || email != null) {
			if (name.length() < 1 || email.length() < 1) {
				return true;
			}
		}
		return false;
	}
}
