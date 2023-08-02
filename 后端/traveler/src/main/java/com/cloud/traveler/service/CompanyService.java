package com.cloud.traveler.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.traveler.utils.PageUtils;
import com.cloud.traveler.entity.CompanyEntity;

import java.util.Map;

/**
 * 
 *
 * @author lfq
 * @email 
 * @date 2023-08-02 21:30:12
 */
public interface CompanyService extends IService<CompanyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

