package com.gakj.dubbo.provider.api.service;

import com.gakj.dubbo.provider.api.entity.User;

import java.util.List;

/**
 * Created by gc on 2016/6/16.
 */
public interface UserService {

    List<User> getAll();
}
