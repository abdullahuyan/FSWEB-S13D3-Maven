package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    double boy;
    double kilo;
    String meslek;
    public  Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public  Person(String firstName, String lastName, int age, double boy, double kilo, String meslek){
        this(firstName,lastName,age);
        this.boy = boy;
        this.kilo = kilo;
        this.meslek = meslek;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen(){
        if(this.age>12 && this.age<20){
            return true;
        }else return false;
    }
}
