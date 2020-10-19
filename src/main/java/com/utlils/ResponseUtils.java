package com.utlils;


import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ResponseUtils {
    public static void responseToJson(HttpServletResponse resp, Object object) throws IOException {
        //设置响应
        resp.setCharacterEncoding("UTF-8");
//        如果服务器返回是json数据必须设置 application/json
        resp.setContentType("application/json; charset=utf-8");
        resp.getWriter().println(JSONObject.toJSONString(object));
    }

}
