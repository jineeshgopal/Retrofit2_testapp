package com.example.spericorn.retrofit2_testapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelResponse {

    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("phoneno")
    @Expose
    private String phoneno;

    public String getCountry() {
        return country;
    }
//TODO:BUG fixed
    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

}
//
//    @SerializedName("Status")
//    @Expose
//    private String status;
//    @SerializedName("Details")
//    @Expose
//    private List<Detail> details = null;
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public List<Detail> getDetails() {
//        return details;
//    }
//
//    public void setDetails(List<Detail> details) {
//        this.details = details;
//    }

