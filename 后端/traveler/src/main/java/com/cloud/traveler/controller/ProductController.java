package com.cloud.traveler.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.traveler.entity.ProductEntity;
import com.cloud.traveler.service.ProductService;
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
@RequestMapping("traveler/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("traveler:product:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = productService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   // @RequiresPermissions("traveler:product:info")
    public R info(@PathVariable("id") Integer id){
		ProductEntity product = productService.getById(id);

        return R.ok().put("product", product);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("traveler:product:save")
    public R save(@RequestBody ProductEntity product){
		productService.save(product);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("traveler:product:update")
    public R update(@RequestBody ProductEntity product){
		productService.updateById(product);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("traveler:product:delete")
    public R delete(@RequestBody Integer[] ids){
		productService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
