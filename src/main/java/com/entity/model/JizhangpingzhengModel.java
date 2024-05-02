package com.entity.model;

import com.entity.JizhangpingzhengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 记账凭证
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
public class JizhangpingzhengModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 凭证名称
	 */
	
	private String pingzhengmingcheng;
		
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 凭证内容
	 */
	
	private String pingzhengneirong;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
		
	/**
	 * 附件
	 */
	
	private String fujian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：凭证名称
	 */
	 
	public void setPingzhengmingcheng(String pingzhengmingcheng) {
		this.pingzhengmingcheng = pingzhengmingcheng;
	}
	
	/**
	 * 获取：凭证名称
	 */
	public String getPingzhengmingcheng() {
		return pingzhengmingcheng;
	}
				
	
	/**
	 * 设置：类型
	 */
	 
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
				
	
	/**
	 * 设置：凭证内容
	 */
	 
	public void setPingzhengneirong(String pingzhengneirong) {
		this.pingzhengneirong = pingzhengneirong;
	}
	
	/**
	 * 获取：凭证内容
	 */
	public String getPingzhengneirong() {
		return pingzhengneirong;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
				
	
	/**
	 * 设置：附件
	 */
	 
	public void setFujian(String fujian) {
		this.fujian = fujian;
	}
	
	/**
	 * 获取：附件
	 */
	public String getFujian() {
		return fujian;
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
			
}
