package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 支票信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
@TableName("zhipiaoxinxi")
public class ZhipiaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhipiaoxinxiEntity() {
		
	}
	
	public ZhipiaoxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 支票号
	 */
					
	private String zhipiaohao;
	
	/**
	 * 收款单位
	 */
					
	private String shoukuandanwei;
	
	/**
	 * 金额
	 */
					
	private Integer jine;
	
	/**
	 * 用途
	 */
					
	private String yongtu;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 开票日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date kaipiaoriqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：支票号
	 */
	public void setZhipiaohao(String zhipiaohao) {
		this.zhipiaohao = zhipiaohao;
	}
	/**
	 * 获取：支票号
	 */
	public String getZhipiaohao() {
		return zhipiaohao;
	}
	/**
	 * 设置：收款单位
	 */
	public void setShoukuandanwei(String shoukuandanwei) {
		this.shoukuandanwei = shoukuandanwei;
	}
	/**
	 * 获取：收款单位
	 */
	public String getShoukuandanwei() {
		return shoukuandanwei;
	}
	/**
	 * 设置：金额
	 */
	public void setJine(Integer jine) {
		this.jine = jine;
	}
	/**
	 * 获取：金额
	 */
	public Integer getJine() {
		return jine;
	}
	/**
	 * 设置：用途
	 */
	public void setYongtu(String yongtu) {
		this.yongtu = yongtu;
	}
	/**
	 * 获取：用途
	 */
	public String getYongtu() {
		return yongtu;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：开票日期
	 */
	public void setKaipiaoriqi(Date kaipiaoriqi) {
		this.kaipiaoriqi = kaipiaoriqi;
	}
	/**
	 * 获取：开票日期
	 */
	public Date getKaipiaoriqi() {
		return kaipiaoriqi;
	}

}
