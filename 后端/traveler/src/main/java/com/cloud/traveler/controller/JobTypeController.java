package com.cloud.traveler.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.traveler.entity.JobTypeEntity;
import com.cloud.traveler.service.JobTypeService;
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
@RequestMapping("traveler/jobtype")
public class JobTypeController {
    @Autowired
    private JobTypeService jobTypeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("traveler:jobtype:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = jobTypeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   // @RequiresPermissions("traveler:jobtype:info")
    public R info(@PathVariable("id") Integer id){
		JobTypeEntity jobType = jobTypeService.getById(id);

        return R.ok().put("jobType", jobType);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("traveler:jobtype:save")
    public R save(@RequestBody JobTypeEntity jobType){
		jobTypeService.save(jobType);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("traveler:jobtype:update")
    public R update(@RequestBody JobTypeEntity jobType){
		jobTypeService.updateById(jobType);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("traveler:jobtype:delete")
    public R delete(@RequestBody Integer[] ids){
		jobTypeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
