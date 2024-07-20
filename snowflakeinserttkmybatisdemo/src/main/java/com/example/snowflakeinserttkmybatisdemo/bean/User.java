package com.example.snowflakeinserttkmybatisdemo.bean;

import com.example.snowflakeinserttkmybatisdemo.util.UUIDGenId;
import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
public class User {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @KeySql(useGeneratedKeys = false,genId = UUIDGenId.class)
    private Long id;
    private String name;
    private Integer age;
    private String createBy;
    private Date createTime;
}

