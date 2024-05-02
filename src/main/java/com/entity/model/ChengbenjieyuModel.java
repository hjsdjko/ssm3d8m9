package com.entity.model;

import com.entity.ChengbenjieyuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 成本结余
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
public class ChengbenjieyuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
				
	
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
