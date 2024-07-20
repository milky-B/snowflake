package com.example.snowflakeinserttkmybatisdemo.util;

import tk.mybatis.mapper.genid.GenId;

public class UUIDGenId implements GenId {
    private static final SnowflakeIdWorker snowFlakeIdWorker = new SnowflakeIdWorker(1,1);
    public Long genId(String table, String column) {
        return snowFlakeIdWorker.nextId();
    }
}
