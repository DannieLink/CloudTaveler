package com.cloud.traveler.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.traveler.utils.PageUtils;
import com.cloud.traveler.entity.AboutEntity;

import java.util.Map;

/**
 * 
 *
 * @author lfq
 * @email 
 * @date 2023-08-02 21:30:12
 */
public interface AboutService extends IService<AboutEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

