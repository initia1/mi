package com.service.impl;

import com.dao.IUserdao;
import com.dao.impl.Userdaoimpl;
import com.entity.User;
import com.service.IUserService;

import java.sql.SQLException;

public class UserServiceimpl implements IUserService {
    IUserdao dao=new Userdaoimpl();

    @Override
    public boolean login(String name, String passwrod) {
        boolean result = false;
        try {
            result = dao.login(name, passwrod);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean register(User user) {
        boolean flag = false;
        //  判断用户名是否存在
        //  如果用户名不存在则 往数据库添加数据
        User temp;
        try {
            temp= dao.findByName(user.getName());
            if (temp == null) {
                try {
                    int count = dao.AddUser(user);
                    flag = count > 0;
                } catch (Exception exception) {
                    System.out.println("注册失败");
                }
            } else {
                System.out.println("用户名已经存在");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public User findByName(String name) {
        User user = null;
        try {
            user = dao.findByName(name);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }


}
