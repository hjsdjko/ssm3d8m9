package com.entity.view;

import com.entity.FapiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 发票信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
@TableName("fapiaoxinxi")
public class FapiaoxinxiView  extends FapiaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FapiaoxinxiView(){
	}
 
 	public FapiaoxinxiView(FapiaoxinxiEntity fapiaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, fapiaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
