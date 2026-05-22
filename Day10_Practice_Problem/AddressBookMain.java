import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        AddressBookSystem system = new AddressBookSystem();

        System.out.println("Welcome to Address Book");

        while (true) {

            System.out.println("\n===== MAIN MENU =====");

            System.out.println("1. Add Address Book");
            System.out.println("2. Select Address Book");
            System.out.println("3. Display Address Books");
            System.out.println("4. Exit");

            System.out.println("Enter Your Choice:");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:

                    System.out.println("Enter Address Book Name:");

                    String bookName = scanner.nextLine();

                    system.addAddressBook(bookName);

                    break;

                case 2:

                    System.out.println("Enter Address Book Name:");

                    String selectedBook = scanner.nextLine();

                    AddressBook addressBook =
                            system.getAddressBook(selectedBook);

                    if (addressBook == null) {

                        System.out.println("Address Book Not Found!");
                        break;
                    }

                    manageAddressBook(addressBook, scanner);

                    break;

                case 3:

                    system.displayAddressBooks();

                    break;

                case 4:

                    System.out.println("Exiting Application...");

                    scanner.close();

                    System.exit(0);

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }

    // Method to Manage Contacts
    public static void manageAddressBook(AddressBook addressBook,
                                         Scanner scanner) {

        while (true) {

            System.out.println("\n===== ADDRESS BOOK MENU =====");

            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Back");

            System.out.println("Enter Your Choice:");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:

                    System.out.println("Enter First Name:");
                    String firstName = scanner.nextLine();

                    System.out.println("Enter Last Name:");
                    String lastName = scanner.nextLine();

                    System.out.println("Enter Address:");
                    String address = scanner.nextLine();

                    System.out.println("Enter City:");
                    String city = scanner.nextLine();

                    System.out.println("Enter State:");
                    String state = scanner.nextLine();

                    System.out.println("Enter ZIP:");
                    String zip = scanner.nextLine();

                    System.out.println("Enter Phone Number:");
                    String phone = scanner.nextLine();

                    System.out.println("Enter Email:");
                    String email = scanner.nextLine();

                    Contact contact = new Contact(
                            firstName,
                            lastName,
                            address,
                            city,
                            state,
                            zip,
                            phone,
                            email
                    );

                    addressBook.addContact(contact);

                    break;

                case 2:

                    System.out.println("Enter First Name to Edit:");

                    String editName = scanner.nextLine();

                    addressBook.editContact(editName, scanner);

                    break;

                case 3:

                    System.out.println("Enter First Name to Delete:");

                    String deleteName = scanner.nextLine();

                    addressBook.deleteContact(deleteName);

                    break;

                case 4:

                    addressBook.displayContacts();

                    break;

                case 5:

                    return;

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}