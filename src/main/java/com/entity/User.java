package com.entity;


public class User {

  private int id;
  private String name;
  private String password;
  private String address;   //用户地址
  private String phone;     //用户手机号
  private int isDelete;     //用户是否被禁用状态 1激活； 0禁用

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public User(String name, String password, String address, String phone, int isDelete) {
        this.name = name;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.isDelete = isDelete;
    }

    public User(String name, String password, String address, String phone) {
        this.name = name;
        this.password = password;
        this.address = address;
        this.phone = phone;
    }

    public User(int id, String name, String password, String address, String phone, int isDelete) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.isDelete = isDelete;
    }

    public User(int id, String name, String password, String address, String phone) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.address = address;
        this.phone = phone;
    }
    public User(String name, String password, String phone) {
        this.name = name;
        this.password = password;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}
