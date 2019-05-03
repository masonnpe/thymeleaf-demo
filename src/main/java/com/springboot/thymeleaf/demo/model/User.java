package com.springboot.thymeleaf.demo.model;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Long id;
    private String username;
    private int age;
    private Date birth;
    private User father;

    public User(Long id, String username, int age, Date birth, User father) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.birth = birth;
        this.father = father;
    }

    public User() {
    }
}
