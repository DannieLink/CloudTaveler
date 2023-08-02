package com.cloud.traveler.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.traveler.entity.ComplanitEntity;
import com.cloud.traveler.service.ComplanitService;
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
@RequestMapping("traveler/complanit")
public class ComplanitController {
    @Autowired
    private ComplanitService complanitService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("traveler:complanit:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = complanitService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   // @RequiresPermissions("traveler:complanit:info")
    public R info(@PathVariable("id") Integer id){
		ComplanitEntity complanit = complanitService.getById(id);

        return R.ok().put("complanit", complanit);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("traveler:complanit:save")
    public R save(@RequestBody ComplanitEntity complanit){
		complanitService.save(complanit);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("traveler:complanit:update")
    public R update(@RequestBody ComplanitEntity complanit){
		complanitService.updateById(complanit);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("traveler:complanit:delete")
    public R delete(@RequestBody Integer[] ids){
		complanitService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
