package com.cloud.traveler.service.impl;

import com.cloud.traveler.utils.PageUtils;
import com.cloud.traveler.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.cloud.traveler.dao.AboutDao;
import com.cloud.traveler.entity.AboutEntity;
import com.cloud.traveler.service.AboutService;


@Service("aboutService")
public class AboutServiceImpl extends ServiceImpl<AboutDao, AboutEntity> implements AboutService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AboutEntity> page = this.page(
                new Query<AboutEntity>().getPage(params),
                new QueryWrapper<AboutEntity>()
        );

        return new PageUtils(page);
    }

}