package serilization.example;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

public class ReadObjectFromFile {

	private static final String LOCAL_FILE_PATH = "/home/ashif/data/";

	private static final String FILE_NAME = "address.ser";

	private static Long getSerialVersionUID() {
		return ObjectStreamClass.lookup(Address.class).getSerialVersionUID();
	}

	public static void main(String[] args) {

		System.out.println("Present Version id of Address is :: " + getSerialVersionUID());

		System.out.println(getObjectFromDisk());

	}

	private static Address getObjectFromDisk() {

		Address address = null;

		try {

			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(LOCAL_FILE_PATH + FILE_NAME));

			address = (Address) objectInputStream.readObject();

			objectInputStream.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return address;
	}

}
