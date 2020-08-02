package com.xianzhang.sharding;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author alexzhang
 * @date 2020/7/21 09:15
 */
public class JdbcConnect {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://192.168.1.3:13308/sharding_db?characterEncoding=UTF-8","root","root");

        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from user_info where uid=1");
        while(rs.next()) {
            long id = rs.getLong(1);
            long age = rs.getLong(2);
            System.out.println(id);System.out.println(age);
        }
    }
}
