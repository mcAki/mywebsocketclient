package com.hack.big6.service;

import com.hack.big6.pojo.User;

import java.util.List;

/**
 * Created by Administrator on 2018/6/7.
 */
public interface UserService {

    public List<User> getUserInfo();

    public void insert(User user);
}
