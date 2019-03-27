package com.mp.service.impl;

import com.mp.model.ProductInfo;
import com.mp.mapper.ProductInfoMapper;
import com.mp.service.ProductInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品信息表 服务实现类
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
@Service
public class ProductInfoServiceImpl extends ServiceImpl<ProductInfoMapper, ProductInfo> implements ProductInfoService {

}
