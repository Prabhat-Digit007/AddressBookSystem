package DAY3.PhoneBook.ContactBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Contact {

    HashMap<String,Address> Loader = new HashMap<>();
    HashMap<String,HashMap<String,String>> LoaderDetails = new HashMap<>();


    public void createContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Name");
        String firstName = sc.next();
        System.out.println("Enter your Last Name");
        String lastName = sc.next();
        System.out.println("Enter your Address");
        String address = sc.next();
        System.out.println("Enter your City");
        String city = sc.next();
        System.out.println("Enter your State");
        String state = sc.next();
        System.out.println("Enter your Zip");
        String zip = sc.next();
        System.out.println("Enter your Email");
        String email = sc.next();
        System.out.println("Enter your PhoneNumber");
        String phoneNumber = sc.next();

        Address allDetails = new Address(firstName,lastName,address,city,state,zip,phoneNumber,email);
//        System.out.println(allDetails.getFirstName());
//        System.out.println(allDetails.hashCode());

        Loader.put(allDetails.getFirstName(),allDetails);
//        HashMap<String,String> inside = new HashMap<>();
//        inside.put("firstName",firstName);
//        inside.put("lastName",lastName);
//        inside.put("address",address);
//        inside.put("city",city);
//        inside.put("state",state);
//        inside.put("zip",zip);
//        inside.put("phoneNumber",phoneNumber);
//        LoaderDetails.put(firstName, inside);
    }

    public void displayIndividualContact(String firstName){
        if(Loader.containsKey(firstName)){
            System.out.println("---->" + Loader.get(firstName));
        }
        else {
            System.out.println("No person found name with this :" + firstName);
        }
//        if(LoaderDetails.containsKey(firstName)){
//            System.out.println("---->" + LoaderDetails.get(firstName));
//        }
//        else {
//            System.out.println("No person found name with this :" + firstName);
//        }

    }

    public void diplayContacts(){
        for (Map.Entry<String,Address> traverse : Loader.entrySet()){
            System.out.println(traverse.getKey());
            Address address = traverse.getValue();
            System.out.println(address.toString());
        }
//        for (HashMap.Entry<String,HashMap<String,String>> traverse : LoaderDetails.entrySet()){
//            System.out.println(traverse.getKey());
//            System.out.println(traverse.getValue());
//        }
    }

    public void updateContact(String name){

        if (Loader.containsKey(name)){
            System.out.println("Choose what do you want yo update!");
            System.out.println("1. First Name");
            System.out.println("2. Last Name");
            System.out.println("3. Address");
            System.out.println("4. City");
            System.out.println("5. State");
            System.out.println("6. Zip");
            System.out.println("7. PhoneNumber");
            System.out.println("8. Email");


        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            switch (n){
                case 1:
                    System.out.println("Enter updated first name for user");
                    String updatedName = sc.next();

                    Address address = Loader.get(name);
                    address.setFirstName(updatedName);
                    Loader.remove(name);
                    Loader.put(updatedName, address);

//                    HashMap<String,String> mew = new HashMap<>();
//                    mew.put("firstName", updatedName);
//                    for(HashMap.Entry<String ,HashMap<String,String >> change : LoaderDetails.entrySet()){
//                        if(Objects.equals(change.getKey(), name)){
//                            change.setValue(mew);
//                        }
//                    }
                    break;


            }
        }
        else{
            System.out.println("No User found in Address Book with name this " + name);
        }

    }

    public void deleteContact(String name) {
        if(Loader.containsKey(name)){
            Loader.remove(name);
        }
        else {
            System.out.println("No person found with name : " + name + " int the contacts");
        }

    }

}

