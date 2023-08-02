package com.cloud.traveler.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.traveler.utils.PageUtils;
import com.cloud.traveler.utils.Query;

import com.cloud.traveler.dao.DevelopmentDao;
import com.cloud.traveler.entity.DevelopmentEntity;
import com.cloud.traveler.service.DevelopmentService;


@Service("developmentService")
public class DevelopmentServiceImpl extends ServiceImpl<DevelopmentDao, DevelopmentEntity> implements DevelopmentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<DevelopmentEntity> page = this.page(
                new Query<DevelopmentEntity>().getPage(params),
                new QueryWrapper<DevelopmentEntity>()
        );

        return new PageUtils(page);
    }

}