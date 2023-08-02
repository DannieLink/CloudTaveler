package com.cloud.traveler.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.traveler.utils.PageUtils;
import com.cloud.traveler.utils.Query;

import com.cloud.traveler.dao.JobCityDao;
import com.cloud.traveler.entity.JobCityEntity;
import com.cloud.traveler.service.JobCityService;


@Service("jobCityService")
public class JobCityServiceImpl extends ServiceImpl<JobCityDao, JobCityEntity> implements JobCityService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<JobCityEntity> page = this.page(
                new Query<JobCityEntity>().getPage(params),
                new QueryWrapper<JobCityEntity>()
        );

        return new PageUtils(page);
    }

}