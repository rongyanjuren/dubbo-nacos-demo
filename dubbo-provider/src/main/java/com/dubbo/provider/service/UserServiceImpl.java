package com.dubbo.provider.service;


import com.dubbo.entity.User;
import com.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class UserServiceImpl implements UserService {
    @Override
    public User getById(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("zhangsan");
        return user;
    }


    @Override
    public User updateByUser(User user) {
        System.out.println("修改方法");
        return user;
    }
}
