package com.cloud.traveler.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.traveler.entity.DevelopmentEntity;
import com.cloud.traveler.service.DevelopmentService;
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
@RequestMapping("traveler/development")
public class DevelopmentController {
    @Autowired
    private DevelopmentService developmentService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("traveler:development:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = developmentService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   // @RequiresPermissions("traveler:development:info")
    public R info(@PathVariable("id") Integer id){
		DevelopmentEntity development = developmentService.getById(id);

        return R.ok().put("development", development);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("traveler:development:save")
    public R save(@RequestBody DevelopmentEntity development){
		developmentService.save(development);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("traveler:development:update")
    public R update(@RequestBody DevelopmentEntity development){
		developmentService.updateById(development);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("traveler:development:delete")
    public R delete(@RequestBody Integer[] ids){
		developmentService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
