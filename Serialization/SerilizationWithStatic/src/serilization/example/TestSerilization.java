package serilization.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerilization {

	private static final String LOCAL_FILE_PATH = "/home/ashif/data/";

	private static final String FILE_NAME = "data.ser";

	private static Person init() {

		Person person = new Person();

		person.setFirstName("MD");

		person.setMiddleName("Ashif");

		person.setLastName("Shadab");

		person.setPetName("Boss");

		return person;

	}

	public static void main(String[] args) {

		Person person = init();

		writeToDisk(person);

		System.out.println(getObjectFromDisk());
	}

	private static void writeToDisk(Person person) {

		try {

			System.out.println("Writing Object Start");

			FileOutputStream fileOutputStream = new FileOutputStream(LOCAL_FILE_PATH + FILE_NAME);

			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

			objectOutputStream.writeObject(person);

			objectOutputStream.close();

			System.out.println("Writing Object Over");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Person getObjectFromDisk() {

		Person person = null;

		try {
			System.out.println("Reading Object Start");

			ObjectInputStream objectInputStream = new ObjectInputStream(
					new FileInputStream(LOCAL_FILE_PATH + FILE_NAME));

			person = (Person) objectInputStream.readObject();

			objectInputStream.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return person;
	}

}
