package org.notes.service;

import org.entity.User;

/**
 * @Author: xc
 * @Description: TODO
 * @Date: 2025/2/18 9:35
 * @Version: 1.0
 */
public interface UserInfoService {

    Integer updateUserAvatar(String userId,String avatar);

    Integer UpdateUserInfo(String userId, String userName, String avatar, String birthdate, String sex);

    User getUserByUserId(String userId);
}
