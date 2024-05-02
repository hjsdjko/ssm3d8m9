package com.entity.view;

import com.entity.GongyingshangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 供应商信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
@TableName("gongyingshangxinxi")
public class GongyingshangxinxiView  extends GongyingshangxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongyingshangxinxiView(){
	}
 
 	public GongyingshangxinxiView(GongyingshangxinxiEntity gongyingshangxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, gongyingshangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
