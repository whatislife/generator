package com.happy.video.controller;/**
 * @ProjectName: generator
 * @Package: com.happy.video.controller
 * @ClassName: UserController
 * @Author: ICBC
 * @Description: 用户控制层
 * @Date: 2021/4/1 10:49
 * @Version: 1.0
 */
import com.happy.video.pojo.User;
import com.happy.video.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Description TODO
 * @Author frankman
 * @Date 2021/4/1 10:49
 */
@RestController()
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("index")
    public String index() {
        return "hello user";
    }

    @RequestMapping("/queryUserById")
    public User selectUserById(String id) {
        System.out.println("id:" + id);
        User user = userService.selectByPrimaryKey(id);
        System.out.println(user.toString());
        return user;
    }

}
