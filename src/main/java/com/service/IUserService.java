package com.service;

import com.entity.User;

public interface IUserService {

    /**
     * 判断登陆
     * @param name
     * @param passwrod
     * @return
     */
    boolean login(String name,String passwrod);


    /**
     * 注册新用户
     * @param user
     * @return
     */
    boolean register(User user);


    /**
     * 通过名字查询用户资料
     * @param name
     * @return
     */
    User findByName(String name);

}
