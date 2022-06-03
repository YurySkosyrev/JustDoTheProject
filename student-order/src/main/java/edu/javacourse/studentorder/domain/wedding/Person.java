package edu.javacourse.studentorder.domain.wedding;

import java.time.LocalDate;

public abstract class Person {
    private String surName;
    private String givenName;
    private String patronymic;
    private LocalDate dataOfBirth;
    private Address address;

    public Person(){

    }

    public Person(String surName, String givenName, String patronymic, LocalDate dataOfBirth) {
        this.surName = surName;
        this.givenName = givenName;
        this.patronymic = patronymic;
        this.dataOfBirth = dataOfBirth;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(LocalDate dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("surName='").append(surName).append('\'');
        sb.append(", givenName='").append(givenName).append('\'');
        sb.append(", patronymic='").append(patronymic).append('\'');
        sb.append(", dataOfBirth=").append(dataOfBirth);
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }
}
