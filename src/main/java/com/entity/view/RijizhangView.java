package com.entity.view;

import com.entity.RijizhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 日记账
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
@TableName("rijizhang")
public class RijizhangView  extends RijizhangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RijizhangView(){
	}
 
 	public RijizhangView(RijizhangEntity rijizhangEntity){
 	try {
			BeanUtils.copyProperties(this, rijizhangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
