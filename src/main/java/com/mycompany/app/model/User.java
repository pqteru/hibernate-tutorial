package com.mycompany.app.model;

import java.sql.Timestamp;

public class User {
    private long id;

    private String username;
    private String password;
    private Timestamp create_time;

    // constructor
    public User() {}

    // setter
    private void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    // getter
    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }
}