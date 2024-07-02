package data.jdbc;

import com.mysql.jdbc.Driver;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

// jdbc连接
public class JDBCDemo {

    public static void main(String[] args) throws Exception {
        //注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/flight";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);

        //定义sql语句
        String sql = "INSERT INTO information(departure_time, name, last_cnt) VALUES(4, 'GUANGDONG-SHANGHAI' ,231)";

        //获取执行sql语句的对象Statment
        Statement stmt = conn.createStatement();

        //执行sql
        int cnt = stmt.executeUpdate(sql); //受影响的行数

        //处理结果
        System.out.println(cnt);

        stmt.close();
        conn.close();

    }
}
