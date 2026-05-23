import java.util.HashMap;
import java.util.Map;

public class AddressBookSystem {

    // Dictionary to Store Multiple Address Books
    private Map<String, AddressBook> addressBooks = new HashMap<>();

    // Add New Address Book
    public void addAddressBook(String name) {

        if (addressBooks.containsKey(name)) {

            System.out.println("Address Book Already Exists!");

        } else {

            addressBooks.put(name, new AddressBook());

            System.out.println("Address Book Added Successfully!");
        }
    }

    // Get Address Book
    public AddressBook getAddressBook(String name) {

        return addressBooks.get(name);
    }

    // Display All Address Books
    public void displayAddressBooks() {

        if (addressBooks.isEmpty()) {

            System.out.println("No Address Books Available!");
            return;
        }

        System.out.println("Available Address Books:");

        for (String name : addressBooks.keySet()) {

            System.out.println(name);
        }
    }
}