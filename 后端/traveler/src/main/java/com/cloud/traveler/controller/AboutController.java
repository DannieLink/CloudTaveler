package com.cloud.traveler.controller;

import java.util.Arrays;
import java.util.Map;


import com.cloud.traveler.utils.PageUtils;
import com.cloud.traveler.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.traveler.entity.AboutEntity;
import com.cloud.traveler.service.AboutService;




/**
 * 
 *
 * @author lfq
 * @email 
 * @date 2023-08-02 21:30:12
 */
@RestController
@RequestMapping("traveler/about")
public class AboutController {
    @Autowired
    private AboutService aboutService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = aboutService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   // @RequiresPermissions("traveler:about:info")
    public R info(@PathVariable("id") Integer id){
		AboutEntity about = aboutService.getById(id);

        return R.ok().put("about", about);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("traveler:about:save")
    public R save(@RequestBody AboutEntity about){
		aboutService.save(about);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("traveler:about:update")
    public R update(@RequestBody AboutEntity about){
		aboutService.updateById(about);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("traveler:about:delete")
    public R delete(@RequestBody Integer[] ids){
		aboutService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
