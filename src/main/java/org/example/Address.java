package org.example;

public class Address {

    private String houseNo;
    private String streetName;
    private String city;
    private String country;
    private int pinCode;

    public Address(String houseNo, String streetName, String city, String country, int pinCode) {
        this.houseNo = houseNo;
        this.streetName = streetName;
        this.city = city;
        this.country = country;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address :" + "houseNo=" + houseNo + ' ' + ", streetName=" + streetName + ' ' +
                ", city=" + city + ' ' + ", country=" + country + ' ' + ", pinCode=" + pinCode ;
    }
}
