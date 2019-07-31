package com.lzj.vcg.controller;

import com.lzj.vcg.domain.User;
import com.lzj.vcg.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description
 * @Author lzj
 * @Date 2019/7/25 15:32
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public List<User> findAll(){
        return userService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public User findUserById(@PathVariable String id){
        User user = userService.findUserById(id);
        LOGGER.debug("用户id: "+user.getId());
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public String insertUser(@PathVariable String id, @RequestBody User user){
        try {
            userService.insertUser(user);
            return "true";
        }catch (Exception e){
            e.printStackTrace();
            return "false";
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateUser(@PathVariable String id, @RequestBody User user){
        try {
            user.setId(id);
            userService.updateUser(user);
            return "true";
        }catch (Exception e){
            e.printStackTrace();
            return "false";
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable String id){
        try {
            userService.deleteUserById(id);
            return "true";
        }catch (Exception e){
            e.printStackTrace();
            return "false";
        }
    }
}
