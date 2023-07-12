package com.dubbo.service;

import com.dubbo.entity.User;

public interface UserService {
    /**
     * getById接口
     *
     * @param id id入参
     * @return
     */
    User getById(Long id);

    /**
     * updateByUser 修改
     *
     * @param user user入参
     * @return
     */
    User updateByUser(User user);
}
