package serilization.example;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	private String firstName;

	private String lastName;

	private static String middleName;

	// static variable with default value
	private static String petName = "Raj";

	// static variable with default value and final
	private final static String height = "100";

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static String getMiddleName() {
		return middleName;
	}

	public static void setMiddleName(String middleName) {
		Person.middleName = middleName;
	}

	public static String getPetName() {
		return petName;
	}

	public static void setPetName(String petName) {
		Person.petName = petName;
	}

	public static String getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName + ", petName="
				+ petName + ", height=" + height + "]";
	}
	
	

}
