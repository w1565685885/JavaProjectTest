package com.at.guigu.test01;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * {DAY}
 * 周二
 * xi156
 */
public class Test03 {
    @Test
    public void test01() throws ClassNotFoundException, SQLException {

        /*
       Scanner in = new Scanner(System.in);
        System.out.println("请输入你的名字");
        String sname = in.next();
        System.out.println("请输入密码");
        String pwd = in.next();

         */
        //加载驱动
       Class.forName("com.mysql.jdbc.Driver");

       //获取链接
        Connection connection = DriverManager.getConnection("jdbc:mysql:///test", "root", "117217");
        //创建命令发送器
        Statement statement = connection.createStatement();
        //4.准备SQL

        String sql = "insert into users values(null,'李白','123')";
        //5.发送SQL获取结果
        int i = statement.executeUpdate(sql);
        //输出结果
        System.out.println(i>0?"成功":"失败");
        //关闭资源
        statement.close();
        connection.close();
    }
}
