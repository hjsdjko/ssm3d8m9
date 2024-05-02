package com.entity.view;

import com.entity.YuangongbaoxiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 员工报销
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
@TableName("yuangongbaoxiao")
public class YuangongbaoxiaoView  extends YuangongbaoxiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuangongbaoxiaoView(){
	}
 
 	public YuangongbaoxiaoView(YuangongbaoxiaoEntity yuangongbaoxiaoEntity){
 	try {
			BeanUtils.copyProperties(this, yuangongbaoxiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
