package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FapiaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FapiaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FapiaoxinxiView;


/**
 * 发票信息
 *
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
public interface FapiaoxinxiService extends IService<FapiaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FapiaoxinxiVO> selectListVO(Wrapper<FapiaoxinxiEntity> wrapper);
   	
   	FapiaoxinxiVO selectVO(@Param("ew") Wrapper<FapiaoxinxiEntity> wrapper);
   	
   	List<FapiaoxinxiView> selectListView(Wrapper<FapiaoxinxiEntity> wrapper);
   	
   	FapiaoxinxiView selectView(@Param("ew") Wrapper<FapiaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FapiaoxinxiEntity> wrapper);
   	
}

