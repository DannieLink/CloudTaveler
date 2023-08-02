package com.cloud.traveler.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.traveler.utils.PageUtils;
import com.cloud.traveler.utils.Query;

import com.cloud.traveler.dao.JobTypeDao;
import com.cloud.traveler.entity.JobTypeEntity;
import com.cloud.traveler.service.JobTypeService;


@Service("jobTypeService")
public class JobTypeServiceImpl extends ServiceImpl<JobTypeDao, JobTypeEntity> implements JobTypeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<JobTypeEntity> page = this.page(
                new Query<JobTypeEntity>().getPage(params),
                new QueryWrapper<JobTypeEntity>()
        );

        return new PageUtils(page);
    }

}