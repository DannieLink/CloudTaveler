package com.cloud.traveler.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.traveler.utils.PageUtils;
import com.cloud.traveler.utils.Query;

import com.cloud.traveler.dao.ComplanitDao;
import com.cloud.traveler.entity.ComplanitEntity;
import com.cloud.traveler.service.ComplanitService;


@Service("complanitService")
public class ComplanitServiceImpl extends ServiceImpl<ComplanitDao, ComplanitEntity> implements ComplanitService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ComplanitEntity> page = this.page(
                new Query<ComplanitEntity>().getPage(params),
                new QueryWrapper<ComplanitEntity>()
        );

        return new PageUtils(page);
    }

}