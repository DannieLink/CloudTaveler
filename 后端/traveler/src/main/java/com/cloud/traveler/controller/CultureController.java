package com.cloud.traveler.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.traveler.entity.CultureEntity;
import com.cloud.traveler.service.CultureService;
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
@RequestMapping("traveler/culture")
public class CultureController {
    @Autowired
    private CultureService cultureService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("traveler:culture:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = cultureService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   // @RequiresPermissions("traveler:culture:info")
    public R info(@PathVariable("id") Integer id){
		CultureEntity culture = cultureService.getById(id);

        return R.ok().put("culture", culture);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("traveler:culture:save")
    public R save(@RequestBody CultureEntity culture){
		cultureService.save(culture);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("traveler:culture:update")
    public R update(@RequestBody CultureEntity culture){
		cultureService.updateById(culture);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("traveler:culture:delete")
    public R delete(@RequestBody Integer[] ids){
		cultureService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
