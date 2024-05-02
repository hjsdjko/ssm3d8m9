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
 * 日记账
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
@TableName("rijizhang")
public class RijizhangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public RijizhangEntity() {
		
	}
	
	public RijizhangEntity(T t) {
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
	 * 序号
	 */
					
	private String xuhao;
	
	/**
	 * 日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
	/**
	 * 摘要
	 */
					
	private String zhaiyao;
	
	/**
	 * 收入
	 */
					
	private Integer shouru;
	
	/**
	 * 支出
	 */
					
	private Integer zhichu;
	
	/**
	 * 金额
	 */
					
	private String jine;
	
	/**
	 * 管理工号
	 */
					
	private String guanligonghao;
	
	/**
	 * 管理姓名
	 */
					
	private String guanlixingming;
	
	
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
	 * 设置：序号
	 */
	public void setXuhao(String xuhao) {
		this.xuhao = xuhao;
	}
	/**
	 * 获取：序号
	 */
	public String getXuhao() {
		return xuhao;
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
	/**
	 * 设置：摘要
	 */
	public void setZhaiyao(String zhaiyao) {
		this.zhaiyao = zhaiyao;
	}
	/**
	 * 获取：摘要
	 */
	public String getZhaiyao() {
		return zhaiyao;
	}
	/**
	 * 设置：收入
	 */
	public void setShouru(Integer shouru) {
		this.shouru = shouru;
	}
	/**
	 * 获取：收入
	 */
	public Integer getShouru() {
		return shouru;
	}
	/**
	 * 设置：支出
	 */
	public void setZhichu(Integer zhichu) {
		this.zhichu = zhichu;
	}
	/**
	 * 获取：支出
	 */
	public Integer getZhichu() {
		return zhichu;
	}
	/**
	 * 设置：金额
	 */
	public void setJine(String jine) {
		this.jine = jine;
	}
	/**
	 * 获取：金额
	 */
	public String getJine() {
		return jine;
	}
	/**
	 * 设置：管理工号
	 */
	public void setGuanligonghao(String guanligonghao) {
		this.guanligonghao = guanligonghao;
	}
	/**
	 * 获取：管理工号
	 */
	public String getGuanligonghao() {
		return guanligonghao;
	}
	/**
	 * 设置：管理姓名
	 */
	public void setGuanlixingming(String guanlixingming) {
		this.guanlixingming = guanlixingming;
	}
	/**
	 * 获取：管理姓名
	 */
	public String getGuanlixingming() {
		return guanlixingming;
	}

}
