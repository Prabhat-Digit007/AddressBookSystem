package DAY3.PhoneBook.AddressBook;

import DAY3.PhoneBook.ContactBook.Contact;

import java.util.Scanner;

public class AddressMain extends Contact {
    public static void main(String[] args){
        System.out.println("Welcome to Address Book");
        Scanner sc = new Scanner(System.in);
        Contact contact1 = new Contact();
        int n = 0;
        while(n!=6) {
            System.out.println("1. Create New Contact");
            System.out.println("2. Edit Existing Contact");
            System.out.println("3. Delete Existing Contact");
            System.out.println("4. Display Individual Contact");
            System.out.println("5. Display All Contact");
            System.out.println("6. Exit from Address Book");
            System.out.println("Choose Options");
            n = sc.nextInt();
            switch (n){
                case 1:
                    contact1.createContact();
                    contact1.diplayContacts();
                    break;

                case 2:
                    System.out.println("Enter name of person you want to Edit Details");
                    String name = sc.next();
                    contact1.updateContact(name);
                    break;

                case 4:
                    System.out.println("Which person contact you want to find");
                    String name1 = sc.next();
                    contact1.displayIndividualContact(name1);
                    break;

                case 5:
                    contact1.diplayContacts();
                    break;
            }


        }
    }
}
