package com.gakj.dubbo.provider.api.mapper;

import com.gakj.dubbo.provider.api.annotation.MyBatisMapper;
import com.gakj.dubbo.provider.api.entity.User;

import java.util.List;


/**
 * Created by gc on 2016/6/16.
 */
@MyBatisMapper
public interface UserMapper {

    List<User> getAll();
}
