package com.entity.model;

import com.entity.YuangongxinchouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 员工薪酬
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
public class YuangongxinchouModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 基本工资
	 */
	
	private Integer jibengongzi;
		
	/**
	 * 全勤奖励
	 */
	
	private Integer quanqinjiangli;
		
	/**
	 * 绩效奖励
	 */
	
	private Integer jixiaojiangli;
		
	/**
	 * 社保补助
	 */
	
	private Integer shebaobuzhu;
		
	/**
	 * 扣款金额
	 */
	
	private Integer koukuanjine;
		
	/**
	 * 扣款事项
	 */
	
	private String koukuanshixiang;
		
	/**
	 * 实发工资
	 */
	
	private String shifagongzi;
		
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
		
	/**
	 * 管理工号
	 */
	
	private String guanligonghao;
		
	/**
	 * 管理姓名
	 */
	
	private String guanlixingming;
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
				
	
	/**
	 * 设置：基本工资
	 */
	 
	public void setJibengongzi(Integer jibengongzi) {
		this.jibengongzi = jibengongzi;
	}
	
	/**
	 * 获取：基本工资
	 */
	public Integer getJibengongzi() {
		return jibengongzi;
	}
				
	
	/**
	 * 设置：全勤奖励
	 */
	 
	public void setQuanqinjiangli(Integer quanqinjiangli) {
		this.quanqinjiangli = quanqinjiangli;
	}
	
	/**
	 * 获取：全勤奖励
	 */
	public Integer getQuanqinjiangli() {
		return quanqinjiangli;
	}
				
	
	/**
	 * 设置：绩效奖励
	 */
	 
	public void setJixiaojiangli(Integer jixiaojiangli) {
		this.jixiaojiangli = jixiaojiangli;
	}
	
	/**
	 * 获取：绩效奖励
	 */
	public Integer getJixiaojiangli() {
		return jixiaojiangli;
	}
				
	
	/**
	 * 设置：社保补助
	 */
	 
	public void setShebaobuzhu(Integer shebaobuzhu) {
		this.shebaobuzhu = shebaobuzhu;
	}
	
	/**
	 * 获取：社保补助
	 */
	public Integer getShebaobuzhu() {
		return shebaobuzhu;
	}
				
	
	/**
	 * 设置：扣款金额
	 */
	 
	public void setKoukuanjine(Integer koukuanjine) {
		this.koukuanjine = koukuanjine;
	}
	
	/**
	 * 获取：扣款金额
	 */
	public Integer getKoukuanjine() {
		return koukuanjine;
	}
				
	
	/**
	 * 设置：扣款事项
	 */
	 
	public void setKoukuanshixiang(String koukuanshixiang) {
		this.koukuanshixiang = koukuanshixiang;
	}
	
	/**
	 * 获取：扣款事项
	 */
	public String getKoukuanshixiang() {
		return koukuanshixiang;
	}
				
	
	/**
	 * 设置：实发工资
	 */
	 
	public void setShifagongzi(String shifagongzi) {
		this.shifagongzi = shifagongzi;
	}
	
	/**
	 * 获取：实发工资
	 */
	public String getShifagongzi() {
		return shifagongzi;
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
