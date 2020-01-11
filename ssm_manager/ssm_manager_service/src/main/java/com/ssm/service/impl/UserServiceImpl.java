package com.ssm.service.impl;

import com.ssm.mapper.UserMapper;
import com.ssm.pojo.User;
import com.ssm.pojo.UserExample;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdEqualTo(id);

        List<User> userList = userMapper.selectByExample(userExample);

        if (userList != null) {
            return userList.get(0);
        }
        return null;
    }

    @Override
    public User login(String username, String password) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserNameEqualTo(username);
        criteria.andPasswdEqualTo(password);
        List<User> userList = userMapper.selectByExample(userExample);
        if (userList.size()==1){
            return userList.get(0);
        }
        return null;
    }

    @Override
    public boolean register(User user) {
        //设置可用
        user.setState(1);
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserNameEqualTo(user.getUserName());
        List<User> userList = userMapper.selectByExample(userExample);
        if (userList.size()>=1){
            return false;
        }
        if (userMapper.insert(user)==1){
            return true;
        }
        return false;
    }
}
