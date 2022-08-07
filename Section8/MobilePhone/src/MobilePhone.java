import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        int isInContactList = findContact(contact.getName());

        if (isInContactList < 0) {
            myContacts.add(contact);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int contactIndex = findContact(oldContact);

        if (contactIndex >= 0) {
            myContacts.set(contactIndex, newContact);
            return true;//Returns true if the contact exists and was updated successfully,
        }

        return false;  //or returns false if the contact doesn't exists.
    }

    public boolean removeContact(Contact contact) {
        int contactIndex = findContact(contact);

        if (contactIndex >= 0) {
            myContacts.remove(contactIndex);
            return true;//Returns true if the contact exists and was removed successfully,
        }

        return false; //or returns false if the contact doesn't exists.
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        return myContacts.indexOf(queryContact(contactName));
    }

    public Contact queryContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++){
            if (myContacts.get(i).getName().equals(contactName)){
                return myContacts.get(i);
            }
        }

        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            String name = myContacts.get(i).getName();
            String pNumber = myContacts.get(i).getPhoneNumber();

            System.out.println((i + 1) + ". " + name + " -> " + pNumber);
        }
    }

}
