package com.mp.service.impl;

import com.mp.model.CustomerInfo;
import com.mp.mapper.CustomerInfoMapper;
import com.mp.service.CustomerInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 客户信息表 服务实现类
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
@Service
public class CustomerInfoServiceImpl extends ServiceImpl<CustomerInfoMapper, CustomerInfo> implements CustomerInfoService {

}
