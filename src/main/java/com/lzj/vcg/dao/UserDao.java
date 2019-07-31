package com.lzj.vcg.dao;

import com.lzj.vcg.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Description
 * @Author lzj
 * @Date 2019/7/31
 */
@Mapper
public interface UserDao {
    /**
     * 获取所有的User
     * @return 返回所有的User list
     */
    @Select("select * from user")
    List<User> findAll();

    /**
     * 通过id查询制定User
     * @param id 查询的User id
     * @return 返回查询到的user
     */
    @Select("select * from user where id = #{id}")
    User findUserById(String id);

    /**
     * 添加一个User
     * @param user 需要插入的User对象
     */
    @Insert("insert into user(ID,NAME,PASSWORD) values(#{id}, #{name}, #{password})")
    void insertUser(User user);

    /**
     * 更新User
     * @param user 需要更新的User对象
     */
    @Update("update user set name = #{name}, password = #{password} where id = #{id}")
    void updateUser(User user);

    /**
     * 删除指定User
     * @param id 需要删除User对象的id
     */
    @Delete("delete from user where id = #{id}")
    void deleteUserById(String id);
}

