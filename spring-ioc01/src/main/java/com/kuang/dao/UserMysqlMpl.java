package com.kuang.dao;

public class UserMysqlMpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("Mysql获取用户数据");
    }
}
