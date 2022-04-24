package com.collection;

public class Main {
    public static void main(String[] args) {
        PersonalDetails personalDetails = new PersonalDetails();
        personalDetails.firstName("Sharad");
        personalDetails.lastName("Bhosale");
        personalDetails.Address("At post nashik");
        personalDetails.City("nashik");
        personalDetails.State("Maharashtra");
        personalDetails.ZipCode(42000);
        personalDetails.PhoneNumber("7387232500");
        personalDetails.Email("sharadbhosale456@.com");
        System.out.println(personalDetails.toString());
    }
}
