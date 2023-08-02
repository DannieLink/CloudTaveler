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
@TableName("culture")
public class CultureEntity implements Serializable {
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
	 * 文化简介
	 */
	private String content;
	/**
	 * 图片路径
	 */
	private String img;
	/**
	 * 0-删除 1-正常
	 */
	private Integer status;

}
