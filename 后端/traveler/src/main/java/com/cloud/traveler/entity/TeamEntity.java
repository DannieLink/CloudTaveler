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
@TableName("team")
public class TeamEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Integer id;
	/**
	 * 名称
	 */
	private String username;
	/**
	 * 职位Id
	 */
	private Integer job;
	/**
	 * 图片
	 */
	private String img;
	/**
	 * 简介
	 */
	private String introduce;
	/**
	 * 0-删除 1-正常
	 */
	private Integer status;

}
