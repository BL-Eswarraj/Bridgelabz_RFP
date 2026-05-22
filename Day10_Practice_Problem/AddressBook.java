import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    // Collection to Store Multiple Contacts
    private ArrayList<Contact> contacts = new ArrayList<>();

    // Add Contact
    public void addContact(Contact contact) {

        contacts.add(contact);

        System.out.println("Contact Added Successfully!");
    }

    // Display All Contacts
    public void displayContacts() {

        if (contacts.isEmpty()) {

            System.out.println("No Contacts Available!");
            return;
        }

        for (Contact contact : contacts) {

            contact.displayContact();
        }
    }

    // Edit Contact Using First Name
    public void editContact(String firstName, Scanner scanner) {

        for (Contact contact : contacts) {

            if (contact.getFirstName().equalsIgnoreCase(firstName)) {

                System.out.println("Enter New Address:");
                String address = scanner.nextLine();

                System.out.println("Enter New City:");
                String city = scanner.nextLine();

                System.out.println("Enter New State:");
                String state = scanner.nextLine();

                System.out.println("Enter New ZIP:");
                String zip = scanner.nextLine();

                System.out.println("Enter New Phone Number:");
                String phone = scanner.nextLine();

                System.out.println("Enter New Email:");
                String email = scanner.nextLine();

                contact.editContact(address, city, state,
                        zip, phone, email);

                System.out.println("Contact Updated Successfully!");
                return;
            }
        }

        System.out.println("Contact Not Found!");
    }

    // Delete Contact Using First Name
    public void deleteContact(String firstName) {

        Contact personToDelete = null;

        for (Contact contact : contacts) {

            if (contact.getFirstName().equalsIgnoreCase(firstName)) {

                personToDelete = contact;
                break;
            }
        }

        if (personToDelete != null) {

            contacts.remove(personToDelete);

            System.out.println("Contact Deleted Successfully!");

        } else {

            System.out.println("Contact Not Found!");
        }
    }
}