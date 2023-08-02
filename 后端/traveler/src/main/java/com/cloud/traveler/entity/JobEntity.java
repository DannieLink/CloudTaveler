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
 * @date 2023-08-02 21:30:13
 */
@Data
@TableName("job")
public class JobEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Integer id;
	/**
	 * 职位名称
	 */
	private String jobname;
	/**
	 * 职位类型id
	 */
	private Integer jobtype;
	/**
	 * 职位所属城市id
	 */
	private Integer jobcity;
	/**
	 * 职位描述
	 */
	private String introduce;
	/**
	 * 职位要求
	 */
	private String requirement;
	/**
	 * 创建时间
	 */
	private Date createtime;
	/**
	 * 0-删除 1-正常
	 */
	private Integer status;

}
