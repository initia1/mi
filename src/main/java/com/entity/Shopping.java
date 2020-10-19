package com.entity;

/**
 * 购物车实体类
 */
public class Shopping {

  private int id;
  private int uid;  //对应用户ID
  private int pid;     //对应商品ID
  private int value;   //数量

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
