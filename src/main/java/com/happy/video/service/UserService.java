package com.happy.video.service;

/**
 * @ProjectName: generator
 * @Package: com.happy.video.service
 * @ClassName: UserService
 * @Author: ICBC
 * @Description: 接口
 * @Date: 2021/4/1 10:46
 * @Version: 1.0
 */
import com.happy.video.pojo.User;

/**
 * Created by *** on 2019/1/10.
 */
public interface UserService {

    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
