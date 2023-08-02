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
@TableName("complanit")
public class ComplanitEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Integer id;
	/**
	 * 举报对象
	 */
	private String complanitname;
	/**
	 * 举报主题
	 */
	private String title;
	/**
	 * 举报内容
	 */
	private String content;
	/**
	 * 附件地址，多个以,分割
	 */
	private String attachment;
	/**
	 * 举报人
	 */
	private String username;
	/**
	 * 举报人邮箱
	 */
	private String email;
	/**
	 * 举报人电话
	 */
	private String phone;
	/**
	 * 举报人QQ
	 */
	private String qq;
	/**
	 * 举报人微信
	 */
	private String wechat;
	/**
	 * 0-未处理 1-已处理
	 */
	private Integer dispose;

}
