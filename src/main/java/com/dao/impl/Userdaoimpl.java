package com.dao.impl;

import com.dao.IUserdao;
import com.entity.User;
import com.utlils.DBManager;
import com.utlils.DBUtlils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Userdaoimpl implements IUserdao {


    @Override
    public Integer AddUser(User user) {
        String sql="insert into user(name,password,address,phone,isdelete) value (?,?,?,?,?)";
        return DBManager.innserUser(sql,user);
    }

    @Override
    public Integer UpUserData(User user) {
        String sql="update user set name=?,password=?,address=?,phone=? where id=?";
        return DBManager.CommonUpdate(sql,user.getName(),user.getPassword(),user.getAddress()
        ,user.getPhone(),user.getId());
    }

    /**
     * 修改用户状态 ，如果1激活状态就赋值为0 禁用 反之 激活
     * @param id
     * @return
     * @throws SQLException
     */
    @Override
    public Integer UpDataState(Integer id) throws SQLException {
        String sql="update user set isdelete=0 where id="+id;
        return DBManager.UpDataState(sql,id);
    }

    @Override
    public List<User> findAll() throws SQLException {
        return DBManager.findAll("select * from user ") ;
    }

    @Override
    public User findById(Integer id) throws SQLException {
        String sql="select * from user where id="+id;
        return DBManager.findById(sql);
    }

    @Override
    public User findByName(String name) throws SQLException {
        String sql="select * from user where name="+name;
        return DBManager.findById(sql);
    }

    @Override
    public boolean login(String name, String password) throws SQLException {
        String sql="select * from user where name=? and password=?";
        return DBManager.login(sql,name,password);
    }

    @Override
    public Integer register(User user) throws SQLException {
        String sql = "insert into user(name,password,address,phone,isDelete) VALUES('?','?','?','?');";
        return DBManager.innserUser(sql,user);
    }
}
