package com.mp.service.impl;

import com.mp.model.DatabaseInfo;
import com.mp.mapper.DatabaseInfoMapper;
import com.mp.service.DatabaseInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
@Service
public class DatabaseInfoServiceImpl extends ServiceImpl<DatabaseInfoMapper, DatabaseInfo> implements DatabaseInfoService {

}
