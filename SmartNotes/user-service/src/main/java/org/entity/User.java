package org.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @Author: xc
 * @Description: TODO
 * @Date: 2025/2/10 16:47
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @TableField("user_id")
    @TableId
    private Long id;
    private String username;

    private String password;
    private String email;
}
