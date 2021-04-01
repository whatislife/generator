package com.happy.video.service.impl;/**
 * @ProjectName: generator
 * @Package: com.happy.video.service.impl
 * @ClassName: UserServiceImpl
 * @Author: ICBC
 * @Description: 实现类
 * @Date: 2021/4/1 10:47
 * @Version: 1.0
 */
import com.happy.video.mapper.UserMapper;
import com.happy.video.pojo.User;
import com.happy.video.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @Description TODO
 * @Author frankman
 * @Date 2021/4/1 10:47
 */
/**
 * Created by *** on 2019/1/10.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(String userId) {
        return userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(String userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }
}
