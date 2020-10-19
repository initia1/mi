package com.packdate;

import com.entity.User;

import java.util.List;

public class PackLogin {
    private List<User> date;

    public PackLogin(List<User> user) {
        this.date=user;
    }

    public List<User> getDate() {
        return date;
    }

    public void setDate(List<User> date) {
        this.date = date;
    }
}
