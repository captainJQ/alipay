package com.jql.pay.alipay.mapper;

import com.jql.pay.alipay.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import javax.validation.constraints.NotNull;

@Mapper
public interface UserMapper {
    @Select("select * from user where id = #{id}")
    User selectByPrimaryKey(@NotNull Integer id);
}
