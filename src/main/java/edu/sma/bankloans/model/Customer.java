package edu.sma.bankloans.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Customer {
    private String id = "1";
    private String passportID;
    private String name = "none";
    private boolean family;
    private int age;
    private Profession profession;
    private Property property;
    private String address;
    private String phone;
    private String contactPerson;
    private LoanHistory loanHistory;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Customer() {
    }

    public Customer(String passportID, String name, boolean family, int age, Profession profession, Property property, String address, String phone, String contactPerson, LoanHistory loanHistory) {
        this.passportID = passportID;
        this.name = name;
        this.family = family;
        this.age = age;
        this.profession = profession;
        this.property = property;
        this.address = address;
        this.phone = phone;
        this.contactPerson = contactPerson;
        this.loanHistory = loanHistory;
    }

    public Customer(String id, String passportID, String name, boolean family, int age, Profession profession, Property property, String address, String phone, String contactPerson, LoanHistory loanHistory, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.passportID = passportID;
        this.name = name;
        this.family = family;
        this.age = age;
        this.profession = profession;
        this.property = property;
        this.address = address;
        this.phone = phone;
        this.contactPerson = contactPerson;
        this.loanHistory = loanHistory;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassportID() {
        return passportID;
    }

    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFamily() {
        return family;
    }

    public void setFamily(boolean family) {
        this.family = family;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public LoanHistory getLoanHistory() {
        return loanHistory;
    }

    public void setLoanHistory(LoanHistory loanHistory) {
        this.loanHistory = loanHistory;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id.equals(customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", passportID='" + passportID + '\'' +
                ", name='" + name + '\'' +
                ", family=" + family +
                ", age=" + age +
                ", profession=" + profession +
                ", property=" + property +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", loanHistory=" + loanHistory +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
