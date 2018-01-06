package com.volly.www.vollyhelper.model;

public class Detail  {

    private String name;
    private String email;
    private Phone phone;

    public Detail(String name, String email, Phone phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
