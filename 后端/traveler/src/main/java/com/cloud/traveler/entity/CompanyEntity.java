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
@TableName("company")
public class CompanyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Integer id;
	/**
	 * 公司名称
	 */
	private String companyname;
	/**
	 * 公司图片，多个以，分割
	 */
	private String img;
	/**
	 * 公司介绍
	 */
	private String content;
	/**
	 * 0-删除 1-正常
	 */
	private Integer status;

}
