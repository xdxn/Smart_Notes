package org.notes.service.impl;


import  org.apache.commons.lang3.RandomStringUtils;
import org.entity.User;
import org.notes.mapper.UserMapper;
import org.notes.service.LoginService;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @Author: xc
 * @Description: TODO
 * @Date: 2025/2/18 15:45
 * @Version: 1.0
 */
@Service
public class LoginServiceImpl implements LoginService {
    private UserMapper userMapper;
    @Override
    public User login(String email) {
        User user = userMapper.selectUserByEmail(email);
        if (user == null) {
            String avatarUrl = "https://qiwusky.oss-cn-beijing.aliyuncs.com/f91ef610-f32f-49f0-b13d-4c7d4cc0f268.jpg";
            User newUser = new User();
            newUser.setId(UUID.randomUUID().toString());
            newUser.setEmail(email);
            newUser.setAvatar(avatarUrl);
            newUser.setUsername(RandomStringUtils.randomAlphanumeric(8));
            userMapper.insert(newUser);
            return newUser;
        }
        return user;
    }
}
