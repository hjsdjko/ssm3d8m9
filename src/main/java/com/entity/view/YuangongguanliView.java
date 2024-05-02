package com.entity.view;

import com.entity.YuangongguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 员工管理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
@TableName("yuangongguanli")
public class YuangongguanliView  extends YuangongguanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuangongguanliView(){
	}
 
 	public YuangongguanliView(YuangongguanliEntity yuangongguanliEntity){
 	try {
			BeanUtils.copyProperties(this, yuangongguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
