package com.dao;

import com.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserdao {

    /**
     * 添加用户
     * @param user
     * @return
     */
     Integer AddUser(User user);

    /**
     * 修改用户信息
     * @param user
     * @return
     */
     Integer UpUserData(User user);

    /**
     * 修改该用户的状态
     * @param id
     * @return
     */
     Integer UpDataState(Integer id) throws SQLException;

    /**
     * 查询所有用户
     * @return
     */
     List<User> findAll() throws SQLException;

    /**
     * 根据ID查询用户信息
    * @param id
     * @return
     */
     User findById(Integer id) throws SQLException;

    /**
     * 根据name查询用户信息
     * @param name
     * @return
     */
     User findByName(String name) throws SQLException;

    /**
     * 判断登陆
     * @param name
     * @param password
     * @return
     */
     boolean login(String name,String password) throws SQLException;

     Integer register(User user)throws SQLException;
}
