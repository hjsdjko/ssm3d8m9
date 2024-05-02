package com.entity.view;

import com.entity.YuangongjiaokuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 员工缴款
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
@TableName("yuangongjiaokuan")
public class YuangongjiaokuanView  extends YuangongjiaokuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuangongjiaokuanView(){
	}
 
 	public YuangongjiaokuanView(YuangongjiaokuanEntity yuangongjiaokuanEntity){
 	try {
			BeanUtils.copyProperties(this, yuangongjiaokuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
