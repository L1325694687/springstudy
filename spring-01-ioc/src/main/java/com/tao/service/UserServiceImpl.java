package com.tao.service;

import com.tao.dao.UserDao;
import com.tao.dao.UserDaoImpl;
import com.tao.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao;
    //利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }


    public void  getUser(){
        userDao.getUser();
    }
}
