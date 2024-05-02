package com.entity.view;

import com.entity.ZhipiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 支票信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
@TableName("zhipiaoxinxi")
public class ZhipiaoxinxiView  extends ZhipiaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhipiaoxinxiView(){
	}
 
 	public ZhipiaoxinxiView(ZhipiaoxinxiEntity zhipiaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zhipiaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
