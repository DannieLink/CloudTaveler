package com.cloud.traveler.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.traveler.entity.TeamEntity;
import com.cloud.traveler.service.TeamService;
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
@RequestMapping("traveler/team")
public class TeamController {
    @Autowired
    private TeamService teamService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("traveler:team:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = teamService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   // @RequiresPermissions("traveler:team:info")
    public R info(@PathVariable("id") Integer id){
		TeamEntity team = teamService.getById(id);

        return R.ok().put("team", team);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("traveler:team:save")
    public R save(@RequestBody TeamEntity team){
		teamService.save(team);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("traveler:team:update")
    public R update(@RequestBody TeamEntity team){
		teamService.updateById(team);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("traveler:team:delete")
    public R delete(@RequestBody Integer[] ids){
		teamService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
