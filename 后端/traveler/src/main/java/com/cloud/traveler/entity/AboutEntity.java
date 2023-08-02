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
@TableName("about")
public class AboutEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Integer id;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 企业名称
	 */
	private String companyname;
	/**
	 * 图片
	 */
	private String companyimg;
	/**
	 * 企业地址
	 */
	private String companyaddress;
	/**
	 * 企业邮箱
	 */
	private String companyemail;
	/**
	 * 企业传真
	 */
	private String companyfax;
	/**
	 * 地区邮编
	 */
	private Integer emailcode;
	/**
	 * 0-删除 1-正常
	 */
	private Integer status;

}
