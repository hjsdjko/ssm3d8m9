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
 * 记账凭证
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
@TableName("jizhangpingzheng")
public class JizhangpingzhengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JizhangpingzhengEntity() {
		
	}
	
	public JizhangpingzhengEntity(T t) {
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
	 * 凭证编号
	 */
					
	private String pingzhengbianhao;
	
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
	 * 设置：凭证编号
	 */
	public void setPingzhengbianhao(String pingzhengbianhao) {
		this.pingzhengbianhao = pingzhengbianhao;
	}
	/**
	 * 获取：凭证编号
	 */
	public String getPingzhengbianhao() {
		return pingzhengbianhao;
	}
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
