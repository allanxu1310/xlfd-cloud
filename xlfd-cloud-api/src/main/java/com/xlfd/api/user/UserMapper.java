package com.xlfd.api.user;

import com.xlfd.domain.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @auther Allan
 * @date 2018/8/27 19:02
 */
@Mapper
public interface UserMapper {

    User getUser(@Param(value = "id") String id);
}
