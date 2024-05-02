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
 * 成本结余
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
@TableName("chengbenjieyu")
public class ChengbenjieyuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChengbenjieyuEntity() {
		
	}
	
	public ChengbenjieyuEntity(T t) {
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
	 * 成本名称
	 */
					
	private String chengbenmingcheng;
	
	/**
	 * 收入项目
	 */
					
	private String shouruxiangmu;
	
	/**
	 * 收入金额
	 */
					
	private Integer shourujine;
	
	/**
	 * 支出项目
	 */
					
	private String zhichuxiangmu;
	
	/**
	 * 支出金额
	 */
					
	private Integer zhichujine;
	
	/**
	 * 结余金额
	 */
					
	private String jieyujine;
	
	/**
	 * 日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
	
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
	 * 设置：成本名称
	 */
	public void setChengbenmingcheng(String chengbenmingcheng) {
		this.chengbenmingcheng = chengbenmingcheng;
	}
	/**
	 * 获取：成本名称
	 */
	public String getChengbenmingcheng() {
		return chengbenmingcheng;
	}
	/**
	 * 设置：收入项目
	 */
	public void setShouruxiangmu(String shouruxiangmu) {
		this.shouruxiangmu = shouruxiangmu;
	}
	/**
	 * 获取：收入项目
	 */
	public String getShouruxiangmu() {
		return shouruxiangmu;
	}
	/**
	 * 设置：收入金额
	 */
	public void setShourujine(Integer shourujine) {
		this.shourujine = shourujine;
	}
	/**
	 * 获取：收入金额
	 */
	public Integer getShourujine() {
		return shourujine;
	}
	/**
	 * 设置：支出项目
	 */
	public void setZhichuxiangmu(String zhichuxiangmu) {
		this.zhichuxiangmu = zhichuxiangmu;
	}
	/**
	 * 获取：支出项目
	 */
	public String getZhichuxiangmu() {
		return zhichuxiangmu;
	}
	/**
	 * 设置：支出金额
	 */
	public void setZhichujine(Integer zhichujine) {
		this.zhichujine = zhichujine;
	}
	/**
	 * 获取：支出金额
	 */
	public Integer getZhichujine() {
		return zhichujine;
	}
	/**
	 * 设置：结余金额
	 */
	public void setJieyujine(String jieyujine) {
		this.jieyujine = jieyujine;
	}
	/**
	 * 获取：结余金额
	 */
	public String getJieyujine() {
		return jieyujine;
	}
	/**
	 * 设置：日期
	 */
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}

}
