package com.cloud.traveler.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.traveler.entity.JobEntity;
import com.cloud.traveler.service.JobService;
import com.cloud.traveler.utils.PageUtils;
import com.cloud.traveler.utils.R;



/**
 * 
 *
 * @author lfq
 * @email 
 * @date 2023-08-02 21:30:13
 */
@RestController
@RequestMapping("traveler/job")
public class JobController {
    @Autowired
    private JobService jobService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("traveler:job:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = jobService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   // @RequiresPermissions("traveler:job:info")
    public R info(@PathVariable("id") Integer id){
		JobEntity job = jobService.getById(id);

        return R.ok().put("job", job);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("traveler:job:save")
    public R save(@RequestBody JobEntity job){
		jobService.save(job);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("traveler:job:update")
    public R update(@RequestBody JobEntity job){
		jobService.updateById(job);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("traveler:job:delete")
    public R delete(@RequestBody Integer[] ids){
		jobService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
