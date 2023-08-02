package com.cloud.traveler.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.traveler.utils.PageUtils;
import com.cloud.traveler.utils.Query;

import com.cloud.traveler.dao.JobDao;
import com.cloud.traveler.entity.JobEntity;
import com.cloud.traveler.service.JobService;


@Service("jobService")
public class JobServiceImpl extends ServiceImpl<JobDao, JobEntity> implements JobService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<JobEntity> page = this.page(
                new Query<JobEntity>().getPage(params),
                new QueryWrapper<JobEntity>()
        );

        return new PageUtils(page);
    }

}