package com.cloud.traveler.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.traveler.utils.PageUtils;
import com.cloud.traveler.utils.Query;

import com.cloud.traveler.dao.TeamDao;
import com.cloud.traveler.entity.TeamEntity;
import com.cloud.traveler.service.TeamService;


@Service("teamService")
public class TeamServiceImpl extends ServiceImpl<TeamDao, TeamEntity> implements TeamService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TeamEntity> page = this.page(
                new Query<TeamEntity>().getPage(params),
                new QueryWrapper<TeamEntity>()
        );

        return new PageUtils(page);
    }

}