package com.cloud.traveler.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.traveler.entity.JobCityEntity;
import com.cloud.traveler.service.JobCityService;
import com.cloud.traveler.utils.PageUtils;
import com.cloud.traveler.utils.R;



/**
 * 
 *
 * @author lfq
 * @email 
 * @date 2023-08-02 21:30:12
 */
@RestController
@RequestMapping("traveler/jobcity")
public class JobCityController {
    @Autowired
    private JobCityService jobCityService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("traveler:jobcity:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = jobCityService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   // @RequiresPermissions("traveler:jobcity:info")
    public R info(@PathVariable("id") Integer id){
		JobCityEntity jobCity = jobCityService.getById(id);

        return R.ok().put("jobCity", jobCity);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("traveler:jobcity:save")
    public R save(@RequestBody JobCityEntity jobCity){
		jobCityService.save(jobCity);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("traveler:jobcity:update")
    public R update(@RequestBody JobCityEntity jobCity){
		jobCityService.updateById(jobCity);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("traveler:jobcity:delete")
    public R delete(@RequestBody Integer[] ids){
		jobCityService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
