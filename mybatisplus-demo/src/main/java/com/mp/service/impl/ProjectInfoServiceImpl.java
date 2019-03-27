package com.mp.service.impl;

import com.mp.model.ProjectInfo;
import com.mp.mapper.ProjectInfoMapper;
import com.mp.service.ProjectInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 项目信息表 服务实现类
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
@Service
public class ProjectInfoServiceImpl extends ServiceImpl<ProjectInfoMapper, ProjectInfo> implements ProjectInfoService {

}
