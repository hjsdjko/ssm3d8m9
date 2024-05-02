package com.entity.vo;

import com.entity.YuangongjiaokuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 员工缴款
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
public class YuangongjiaokuanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 缴费名称
	 */
	
	private String jiaofeimingcheng;
		
	/**
	 * 缴款金额
	 */
	
	private Integer jiaokuanjine;
		
	/**
	 * 缴款日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiaokuanriqi;
		
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
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
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
	 * 设置：缴费名称
	 */
	 
	public void setJiaofeimingcheng(String jiaofeimingcheng) {
		this.jiaofeimingcheng = jiaofeimingcheng;
	}
	
	/**
	 * 获取：缴费名称
	 */
	public String getJiaofeimingcheng() {
		return jiaofeimingcheng;
	}
				
	
	/**
	 * 设置：缴款金额
	 */
	 
	public void setJiaokuanjine(Integer jiaokuanjine) {
		this.jiaokuanjine = jiaokuanjine;
	}
	
	/**
	 * 获取：缴款金额
	 */
	public Integer getJiaokuanjine() {
		return jiaokuanjine;
	}
				
	
	/**
	 * 设置：缴款日期
	 */
	 
	public void setJiaokuanriqi(Date jiaokuanriqi) {
		this.jiaokuanriqi = jiaokuanriqi;
	}
	
	/**
	 * 获取：缴款日期
	 */
	public Date getJiaokuanriqi() {
		return jiaokuanriqi;
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
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
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
