package com.ssm.service;

import com.ssm.model.User;

import java.util.List;

/**
 * @PackageName:com.ssm.service
 * @Date:2019/8/15 21:57
 * @Author: zsy
 */
public interface UserService {

    List<User> selectAll();
}
