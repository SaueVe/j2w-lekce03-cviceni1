package cz.czechitas.java2webapps.lekce3.entity;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person() {
    }

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getAge() {
        if(birthDate == null) {
            return null;
        }

        Period period = birthDate.until(LocalDate.now());
        return period.getYears();
    }

//    public String toString() {
//        return String.format("%1$s %2$s (nar. %3$te. %3$tm. %3$tY)", firstName, lastName, birthDate);
//    }
}
