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

import com.cloud.traveler.entity.CompanyEntity;
import com.cloud.traveler.service.CompanyService;




/**
 * 
 *
 * @author lfq
 * @email 
 * @date 2023-08-02 21:30:12
 */
@RestController
@RequestMapping("traveler/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("traveler:company:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = companyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   // @RequiresPermissions("traveler:company:info")
    public R info(@PathVariable("id") Integer id){
		CompanyEntity company = companyService.getById(id);

        return R.ok().put("company", company);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("traveler:company:save")
    public R save(@RequestBody CompanyEntity company){
		companyService.save(company);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("traveler:company:update")
    public R update(@RequestBody CompanyEntity company){
		companyService.updateById(company);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("traveler:company:delete")
    public R delete(@RequestBody Integer[] ids){
		companyService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
