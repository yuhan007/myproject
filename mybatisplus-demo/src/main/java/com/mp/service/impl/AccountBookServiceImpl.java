package com.mp.service.impl;

import com.mp.model.AccountBook;
import com.mp.mapper.AccountBookMapper;
import com.mp.service.AccountBookService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 账簿信息表 服务实现类
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
@Service
public class AccountBookServiceImpl extends ServiceImpl<AccountBookMapper, AccountBook> implements AccountBookService {

}
