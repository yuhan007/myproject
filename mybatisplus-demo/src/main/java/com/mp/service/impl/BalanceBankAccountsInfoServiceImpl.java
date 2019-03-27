package com.mp.service.impl;

import com.mp.model.BalanceBankAccountsInfo;
import com.mp.mapper.BalanceBankAccountsInfoMapper;
import com.mp.service.BalanceBankAccountsInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 结算单与收款账户关联表 服务实现类
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
@Service
public class BalanceBankAccountsInfoServiceImpl extends ServiceImpl<BalanceBankAccountsInfoMapper, BalanceBankAccountsInfo> implements BalanceBankAccountsInfoService {

}
