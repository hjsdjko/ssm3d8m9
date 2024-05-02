package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongyingshangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongyingshangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongyingshangxinxiView;


/**
 * 供应商信息
 *
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
public interface GongyingshangxinxiService extends IService<GongyingshangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongyingshangxinxiVO> selectListVO(Wrapper<GongyingshangxinxiEntity> wrapper);
   	
   	GongyingshangxinxiVO selectVO(@Param("ew") Wrapper<GongyingshangxinxiEntity> wrapper);
   	
   	List<GongyingshangxinxiView> selectListView(Wrapper<GongyingshangxinxiEntity> wrapper);
   	
   	GongyingshangxinxiView selectView(@Param("ew") Wrapper<GongyingshangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongyingshangxinxiEntity> wrapper);
   	
}

