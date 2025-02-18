package org.notes.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;
import org.entity.User;

/**
 * @Author: xc
 * @Description: TODO
 * @Date: 2025/2/18 9:08
 * @Version: 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Results(
            @Result(column = "user_id", property = "userId")
    )
    @Select("select * from user where email = #{email}")
    User selectUserByEmail(String email);
    @Update("update user set avatar = #{avatar} where user_id = #{userId}")
    Integer updateUserAvatar(String userId, String avatar);
    @Update("update user set username = #{userName}, avatar = #{avatar}, birthdate = #{birthdate}, sex = #{sex} where user_id = #{userId} ")
    Integer UpdateUserInfo(String userId, String userName, String avatar, String birthdate, String sex);
    @Results(
            @Result(column = "user_id", property = "userId")
    )
    @Select("select * from user where user_id = #{userId}")
    User selectUserById(String userId);
}
