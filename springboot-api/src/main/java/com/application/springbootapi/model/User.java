package com.application.springbootapi.model;


public class User {
    
    public User(String id, String name, String age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }
    private String id;
    private String name;
    private String age;
    private String email;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + "]";
    }
}
