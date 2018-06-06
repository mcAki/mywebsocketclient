package com.hack.big6.service.impl;

import com.hack.big6.mapper.UserMapper;
import com.hack.big6.pojo.User;
import com.hack.big6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/6/7.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    public List<User> getUserInfo(){
        return userMapper.findUserInfo();
    }


    public void insert(User user) {
        userMapper.addUserInfo(user);
    }
}
