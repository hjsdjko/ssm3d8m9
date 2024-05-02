package com.entity.model;

import com.entity.RijizhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 日记账
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
public class RijizhangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
