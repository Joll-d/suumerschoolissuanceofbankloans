package edu.sma.bankloans.form;

import edu.sma.bankloans.model.LoanHistory;

public class CustomerForm {
    private String passportID;
    private String name ;
    private boolean family;
    private int age;
    private String profession;
    private String property;
    private String address;
    private String phone;
    private String contactPerson;
    private LoanHistory loanHistory;

    public CustomerForm() {
    }

    public CustomerForm(String passportID, String name, boolean family, int age, String profession, String property, String address, String phone, String contactPerson, LoanHistory loanHistory) {
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

    public boolean getFamily() {
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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
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

    @Override
    public String toString() {
        return "CustomerForm{" +
                "passportID='" + passportID + '\'' +
                ", name='" + name + '\'' +
                ", family=" + family +
                ", age=" + age +
                ", profession=" + profession +
                ", property=" + property +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", loanHistory=" + loanHistory +
                '}';
    }
}
