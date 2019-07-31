package com.lzj.vcg.service;

import com.lzj.vcg.domain.User;

import java.util.List;

/**
 * @Description
 * @Author lzj
 * @Date 2019/7/31
 */
public interface UserService {

    /**
     * 获取所有的User
     * @return
     */
    List<User> findAll();

    /**
     * 通过id查询制定User
     * @param id
     * @return
     */
    User findUserById(String id);

    /**
     * 添加一个User
     * @param user
     */
    void insertUser(User user);

    /**
     * 更新User
     * @param user
     */
    void updateUser(User user);

    /**
     * 删除指定User
     * @param id
     */
    void deleteUserById(String id);
}
