package com.xianzhang.sharding;

import com.xianzhang.sharding.bean.UserInfo;
import com.xianzhang.sharding.mapper.UserInfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShardingApplicationTests {


    @Autowired
    UserInfoMapper userInfoMapper;
    @Test
    void contextLoads() {
        UserInfo userInfo=new UserInfo();
        userInfo.setUid(11110L);
        userInfo.setAge(122);
        userInfo.setName("test");
        userInfoMapper.insert(userInfo);
    }

}
