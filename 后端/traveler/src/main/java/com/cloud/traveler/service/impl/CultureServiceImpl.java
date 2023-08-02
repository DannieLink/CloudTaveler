package com.cloud.traveler.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.traveler.utils.PageUtils;
import com.cloud.traveler.utils.Query;

import com.cloud.traveler.dao.CultureDao;
import com.cloud.traveler.entity.CultureEntity;
import com.cloud.traveler.service.CultureService;


@Service("cultureService")
public class CultureServiceImpl extends ServiceImpl<CultureDao, CultureEntity> implements CultureService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CultureEntity> page = this.page(
                new Query<CultureEntity>().getPage(params),
                new QueryWrapper<CultureEntity>()
        );

        return new PageUtils(page);
    }

}