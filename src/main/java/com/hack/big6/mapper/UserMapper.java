package com.hack.big6.mapper;

import com.hack.big6.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> findUserInfo();
    public int addUserInfo(User user);
    public int delUserInfo(int id);
}
