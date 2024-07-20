package com.example.snowflakeinserttkmybatisdemo.mapper;

import com.example.snowflakeinserttkmybatisdemo.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User>{
}
