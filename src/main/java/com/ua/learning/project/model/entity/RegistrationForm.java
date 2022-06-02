package com.ua.learning.project.model.entity;

import java.util.Objects;

public class RegistrationForm {
    private String firstName;
    private String lastName;
    private String birthday;
    private int age;

    @Override
    public String toString() {
        return "RegistrationForm{firstName='"+firstName+"', lastName='"+lastName+"', birthday='"+birthday+"', age="+age+"}";
    }

    @Override
    public int hashCode() {
        if(firstName.length()>3){
            System.out.println("firstName is more than 3 symbols");
            return 0;
        }else{return Objects.hash(firstName);

        }
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public RegistrationForm() {
    }

    public RegistrationForm(String firstName, String lastName, String birthday, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.age = age;
    }

    public RegistrationForm(String firstName) {
        this.firstName = firstName;
    }
}
