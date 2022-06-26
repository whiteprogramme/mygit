package com.kuang.dao;

public class UserOracleImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("Oracle获取用户数据,hello,world");
    }
}
