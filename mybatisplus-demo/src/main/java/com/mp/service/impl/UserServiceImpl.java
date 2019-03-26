package com.mp.service.impl;

import com.mp.model.User;
import com.mp.mapper.UserMapper;
import com.mp.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wj
 * @since 2019-03-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
