package com.cloud.traveler.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author lfq
 * @email 
 * @date 2023-08-02 21:30:12
 */
@Data
@TableName("product")
public class ProductEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Integer id;
	/**
	 * 产品名称
	 */
	private String productname;
	/**
	 * 简要概述
	 */
	private String summarize;
	/**
	 * 详细概述
	 */
	private String introduce;
	/**
	 * 产品链接
	 */
	private String productlink;
	/**
	 * 产品图片地址 多张以，分割
	 */
	private String productimg;
	/**
	 * 产品logo地址
	 */
	private String logo;
	/**
	 * 创建时间
	 */
	private Date createtime;
	/**
	 * 0-正常 1-删除
	 */
	private Integer status;

}
