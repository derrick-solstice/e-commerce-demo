package com.solstice.ecommercedemo.model;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;
    private String firstName;
    private String lastName;
    private String email;

    @OneToMany(mappedBy = "account")
    private List<Order> orders;

    public Account() {
    }

//    public Account(String firstName, String lastName, String email) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//    }


    public Account(String firstName, String lastName, String email, List<Order> orders) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.orders = orders;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
