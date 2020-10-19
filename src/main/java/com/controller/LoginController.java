package com.controller;

import com.entity.User;
import com.packdate.PackLogin;
import com.resp.BaseResponseEntity;
import com.service.IUserService;
import com.service.impl.UserServiceimpl;
import com.utlils.ResponseUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginController extends HttpServlet {
    IUserService service=new UserServiceimpl();


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        String username = req.getParameter("username");
        String password = req.getParameter("password");

//        String username="123";
//        String password="123";
        System.out.println("登陆接收到的数据"+username);
        System.out.println(password);

        boolean flag = service.login(username, password);


        BaseResponseEntity<Boolean> entity=null;

        if(flag){
            entity=new BaseResponseEntity(200,"success",username);
            req.setAttribute("username",username);

        }else {
            entity=BaseResponseEntity.error();
        }
        ResponseUtils.responseToJson(resp, entity);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doPost(req, resp);
    }
}
