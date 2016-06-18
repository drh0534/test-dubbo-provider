package com.gakj.dubbo.provider.api.service.impl;

import com.gakj.dubbo.provider.api.entity.User;
import com.gakj.dubbo.provider.api.service.UserService;

import java.util.ArrayList;
import java.util.List;

//import com.gakj.dubbo.provider.api.mapper.UserMapper;

/**
 * Created by gc on 2016/6/16.
 */
public class UserServiceImpl implements UserService {

//    @Autowired
//    UserMapper userMapper;

    public List<User> getAll() {

        List<User> list = new ArrayList<User>();

        User u1 = new User();
        u1.setId(1L);
        u1.setName("aa");
        u1.setPwd("123456");
        list.add(u1);
//        return userMapper.getAll();
        return list;
    }
}
