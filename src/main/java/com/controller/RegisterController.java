package com.controller;

import com.entity.User;
import com.resp.BaseResponseEntity;
import com.service.IUserService;
import com.service.impl.UserServiceimpl;
import com.utlils.ResponseUtils;
import jdk.nashorn.internal.ir.CallNode;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegisterController extends HttpServlet {
    IUserService service = new UserServiceimpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String phone = req.getParameter("phone");

        User user = new User(username,password,phone);

        boolean register = service.register(user);
        BaseResponseEntity<Boolean> entity=null;

        if(register){
            entity=new BaseResponseEntity(200,"success",user);
            req.setAttribute("user",user);

        }else {
            entity=BaseResponseEntity.error();
        }
        ResponseUtils.responseToJson(resp, entity);
    }
}
