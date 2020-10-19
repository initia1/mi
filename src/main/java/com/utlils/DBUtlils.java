package com.utlils;

import javax.print.attribute.standard.MediaSize;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtlils {
    private static String URL=null;
    private static String CLASSNAME=null;
    private static String NAME=null;
    private static String PASSWORD=null;

    /**
     * 数据库工具类
     * @return
     */
    public static Connection getCon(){
        Connection connection=null;
        try {
            Properties properties=new Properties();
            properties.load(DBUtlils.class.getClassLoader().getResourceAsStream("jdbc.properties"));
            URL = properties.getProperty("url");
            CLASSNAME=properties.getProperty("ClassName");
            NAME=properties.getProperty("name");
            PASSWORD=properties.getProperty("password");
            Class.forName(CLASSNAME);
            connection= DriverManager.getConnection(URL, NAME,PASSWORD);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }


    public static void CloseAll(AutoCloseable... autoCloseables){
        try {
            for (AutoCloseable ac:autoCloseables) {
                if(ac!=null){
                    ac.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

