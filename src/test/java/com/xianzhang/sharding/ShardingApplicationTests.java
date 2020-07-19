package com.xianzhang.sharding;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.xianzhang.sharding.bean.Config;
import com.xianzhang.sharding.bean.UserInfo;
import com.xianzhang.sharding.bean.UserInfoPriv;
import com.xianzhang.sharding.mapper.ConfigMapper;
import com.xianzhang.sharding.mapper.UserInfoMapper;
import com.xianzhang.sharding.mapper.UserInfoPrivMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShardingApplicationTests {


    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    UserInfoPrivMapper userInfoPrivMapper;
    @Autowired
    ConfigMapper configMapper;

    @Test
    void newUser2() {
        UserInfo userInfo=new UserInfo();
        userInfo.setUid(33L);
        userInfo.setAge(2);
        userInfo.setName("test");
        userInfoMapper.insert(userInfo);
        QueryWrapper<UserInfo> queryWrapper=new QueryWrapper<>();
        queryWrapper.setEntity(userInfo);
        Object obj=userInfoMapper.selectById("32");
        System.out.println("a"+obj);
    }

    @Test
    void newUser() {
        UserInfo userInfo=new UserInfo();
        userInfo.setUid(31L);
        userInfo.setAge(2);
        userInfo.setName("test");

        UserInfoPriv userInfoPriv=new UserInfoPriv();
        userInfoPriv.setPid(523L);
        userInfoPriv.setUid(31L);
        userInfoPrivMapper.insert(userInfoPriv);
        userInfoMapper.insert(userInfo);
    }

    @Test
    void config() {
        Config config=new Config();
        config.setCid(123L);
        config.setCname("config");
        configMapper.insert(config);
    }
    @Test
    void configDel() {
        Config config=new Config();
        config.setCid(123L);
        config.setCname("config");
        configMapper.delete(new Wrapper<Config>() {
            @Override
            public Config getEntity() {
                return config;
            }

            @Override
            public MergeSegments getExpression() {
                return null;
            }

            @Override
            public String getCustomSqlSegment() {
                return null;
            }

            @Override
            public String getSqlSegment() {
                return null;
            }
        });
    }

}
