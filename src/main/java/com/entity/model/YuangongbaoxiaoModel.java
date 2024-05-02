package com.entity.model;

import com.entity.YuangongbaoxiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 员工报销
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
public class YuangongbaoxiaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 报销项目
	 */
	
	private String baoxiaoxiangmu;
		
	/**
	 * 报销金额
	 */
	
	private Integer baoxiaojine;
		
	/**
	 * 申请日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenqingriqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 管理工号
	 */
	
	private String guanligonghao;
		
	/**
	 * 管理姓名
	 */
	
	private String guanlixingming;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：报销项目
	 */
	 
	public void setBaoxiaoxiangmu(String baoxiaoxiangmu) {
		this.baoxiaoxiangmu = baoxiaoxiangmu;
	}
	
	/**
	 * 获取：报销项目
	 */
	public String getBaoxiaoxiangmu() {
		return baoxiaoxiangmu;
	}
				
	
	/**
	 * 设置：报销金额
	 */
	 
	public void setBaoxiaojine(Integer baoxiaojine) {
		this.baoxiaojine = baoxiaojine;
	}
	
	/**
	 * 获取：报销金额
	 */
	public Integer getBaoxiaojine() {
		return baoxiaojine;
	}
				
	
	/**
	 * 设置：申请日期
	 */
	 
	public void setShenqingriqi(Date shenqingriqi) {
		this.shenqingriqi = shenqingriqi;
	}
	
	/**
	 * 获取：申请日期
	 */
	public Date getShenqingriqi() {
		return shenqingriqi;
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
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
