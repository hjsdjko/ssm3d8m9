package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangpinkucunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangpinkucunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpinkucunView;


/**
 * 商品库存
 *
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
public interface ShangpinkucunService extends IService<ShangpinkucunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangpinkucunVO> selectListVO(Wrapper<ShangpinkucunEntity> wrapper);
   	
   	ShangpinkucunVO selectVO(@Param("ew") Wrapper<ShangpinkucunEntity> wrapper);
   	
   	List<ShangpinkucunView> selectListView(Wrapper<ShangpinkucunEntity> wrapper);
   	
   	ShangpinkucunView selectView(@Param("ew") Wrapper<ShangpinkucunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpinkucunEntity> wrapper);
   	
}

