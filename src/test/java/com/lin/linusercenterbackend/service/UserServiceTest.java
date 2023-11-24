package com.lin.linusercenterbackend.service;

import com.lin.linusercenterbackend.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 用户注册测试
 *
 * author: 李琳
 */
@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("lingogo");
        user.setUserAccount("123");
        user.setAvatarUrl("https://profile-avatar.csdnimg.cn/");
        user.setGender(0);
        user.setUserPassword("123456789");
        user.setPhone("123456");
        user.setEmail("12456@qq.com");
        boolean result = userService.save(user);
        System.out.println("新增用户ID："+user.getId());
        // 断言，判断一下是否符合预期结果。assertTrue：是否保存成功
        Assertions.assertTrue(result);

    }

    /**
     * 测试出错的情况
     */
    @Test
    void userRegister() {
// 测试非空
        String userAccount = "lingogo";
        String userPassword = "";
        String checkPassword = "123456789";
        String userCode = "12345";
        long result = userService.userRegister(userAccount, userPassword, checkPassword, userCode);
        Assertions.assertEquals(-1, result);
// 测试账户长度小于4
        userAccount = "gogo";
        result = userService.userRegister(userAccount, userPassword, checkPassword,userCode);
        Assertions.assertEquals(-1, result);
// 测试密码小于6位
        userAccount = "xiaogo";
        userPassword = "1234";
        result = userService.userRegister(userAccount, userPassword, checkPassword,userCode);
        Assertions.assertEquals(-1, result);
// 测试特殊字符
        userAccount = "gogo@";
        userPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword,userCode);
        Assertions.assertEquals(-1, result);
// 测试密码和校验密码不相同
        userAccount = "xiaogo";
        checkPassword = "123457899";
        result = userService.userRegister(userAccount, userPassword, checkPassword,userCode);
        Assertions.assertEquals(-1, result);
// 测试账号不重复
        userAccount = "lingogo";
        checkPassword = "123456789";
        result = userService.userRegister(userAccount, userPassword, checkPassword,userCode);
        Assertions.assertEquals(-1, result);
//插入数据
        userAccount = "xiaolin";
        userPassword = "12345678";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword,userCode);
        Assertions.assertEquals(-1, result);
    }

}