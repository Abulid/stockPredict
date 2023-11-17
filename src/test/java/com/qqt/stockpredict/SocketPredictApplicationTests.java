package com.qqt.stockpredict;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qqt.stockpredict.mapper.UserMapper;
import com.qqt.stockpredict.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.Resource;

@SpringBootTest
class SocketPredictApplicationTests {
    @Resource
    private UserMapper userMapper;
    @Test
    public void testBCryptPasswordEncoder() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encode = passwordEncoder.encode("1234");
        String encode2 = passwordEncoder.encode("123456");
        boolean matches = passwordEncoder.matches("1234", "$2a$10$WCD7xp6lxrS.PvGmL86nhuFHMKJTc58Sh0dG1EQw0zSHjlLFyFvde");
        System.out.println(encode);
        System.out.println(encode2);
        System.out.println(matches);

        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("userName","qqtang");
        User user = userMapper.selectOne(wrapper);
        System.out.println("user = " + user);
    }


}
