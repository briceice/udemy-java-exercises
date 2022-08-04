package main;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        if (findContact(contact) != -1) {
            return false;
        } else {
            myContacts.add(contact);
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        if (findContact(oldContact) != -1){
            myContacts.set(myContacts.indexOf(oldContact), newContact);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact){
        if (findContact(contact) != -1){
            myContacts.remove(contact);
            return true;
        } else {
            return false;
        }
    }

    private int findContact(Contact contact){
        return findContact(contact.getName());
    }

    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }


    public Contact queryContact(String contactName) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(contactName)) {
                return contact;
            }
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i+1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
