package serilization.example;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * If We are going to persist object of that class which doesn't implements
 * Serializable interface then it will throw java.io.NotSerializableException:
 * serilization.example.Address
 */
public class WriteObjectToFile {

	private static Address init() {

		Address address = new Address();

		address.setStreet("Laxmi Nagar");
		address.setCountry("India");

		return address;
	}

	public static void main(String[] args) {

		Address address = init();

		writeToDisk(address);
	}

	private static void writeToDisk(Address address) {
		try {

			System.out.println("Writing Object Start");

			FileOutputStream fileOutputStream = new FileOutputStream("/home/ashif/data/address.ser");

			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

			objectOutputStream.writeObject(address);

			objectOutputStream.close();

			System.out.println("Writing Object Over");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
