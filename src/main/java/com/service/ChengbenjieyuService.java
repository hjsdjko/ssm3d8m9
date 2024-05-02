package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChengbenjieyuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChengbenjieyuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChengbenjieyuView;


/**
 * 成本结余
 *
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
public interface ChengbenjieyuService extends IService<ChengbenjieyuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChengbenjieyuVO> selectListVO(Wrapper<ChengbenjieyuEntity> wrapper);
   	
   	ChengbenjieyuVO selectVO(@Param("ew") Wrapper<ChengbenjieyuEntity> wrapper);
   	
   	List<ChengbenjieyuView> selectListView(Wrapper<ChengbenjieyuEntity> wrapper);
   	
   	ChengbenjieyuView selectView(@Param("ew") Wrapper<ChengbenjieyuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChengbenjieyuEntity> wrapper);
   	
}

