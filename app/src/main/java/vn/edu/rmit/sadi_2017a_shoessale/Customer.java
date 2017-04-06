package vn.edu.rmit.sadi_2017a_shoessale;

import android.location.Address;

import java.util.Date;


class Customer extends User {
    //    TODO: how to implement ID co dang la String thay vi int?
    private String customerID;
    private int phoneNumber;
    //    TODO: noi Tu da dinh nghia du field email trong class Customer
    private String email;
    //    TODO: noi Tu la DOB phai la Date class
    private Date dateOfBirth;
    //    TODO: hoi Tu co dong y cho dung class Address cua Android de specifically store address hay khong
    private Address address;

    Customer(int phoneNumber, Date dateOfBirth, Address address, String firstName, String lastName, String email, String password, boolean login_status) {
        super(firstName, lastName, email, password, login_status);
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
//        TODO: set customerID
    }

    //    TODO: hoi Tu tai sao k simply call constructor cua class Customer ma phai co method register
    public void register() {

    }

    public void login() {
//        TODO: to implement
    }

    public void updateProfile() {
//        TODO: to implement
    }

    //    TODO: hoi Tu tai sao lai de search la mot method cua Customer
    public void search() {
//        TODO: to implement
    }

    public void getCart() {
//        TODO: to implement
    }

    public String getCustomerID() {
        return customerID;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
