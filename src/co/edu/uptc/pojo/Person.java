package src.co.edu.uptc.pojo;

import java.util.Date;

public class Person {
    
    private String typeDocument;
    private int document;
    private String name;
    private String lastName;
    private Date birthDay;
    private String gender;

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public java.util.Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date date) {
        this.birthDay = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person(){
        
    }

}
