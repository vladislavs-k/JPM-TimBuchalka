public class Main {
    public static void main(String[] args) {
        MobilePhone mp = new MobilePhone("12345678");

        Contact Bob = new Contact("Bob", "31415926");
        Contact Alice = new Contact("Alice", "16180339");
        Contact Tom = new Contact("Tom", "11235813");
        Contact Jane = new Contact("Jane", "23571113");
        Contact Bob2 = new Contact("Bob", "00000000");
        Contact Alice2 = new Contact("Alice", "22222222");

        mp.addNewContact(Bob);
        mp.addNewContact(Alice);
        mp.addNewContact(Tom);
        mp.addNewContact(Jane);
        mp.addNewContact(Bob2); //Should not be added to the contact list

        mp.printContacts();

        mp.updateContact(Alice, Alice2);
        mp.printContacts();

        mp.removeContact(Bob2);
        mp.printContacts();

        mp.removeContact(Tom);
        mp.printContacts();

    }
}
