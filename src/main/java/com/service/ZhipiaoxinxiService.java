package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhipiaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhipiaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhipiaoxinxiView;


/**
 * 支票信息
 *
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
public interface ZhipiaoxinxiService extends IService<ZhipiaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhipiaoxinxiVO> selectListVO(Wrapper<ZhipiaoxinxiEntity> wrapper);
   	
   	ZhipiaoxinxiVO selectVO(@Param("ew") Wrapper<ZhipiaoxinxiEntity> wrapper);
   	
   	List<ZhipiaoxinxiView> selectListView(Wrapper<ZhipiaoxinxiEntity> wrapper);
   	
   	ZhipiaoxinxiView selectView(@Param("ew") Wrapper<ZhipiaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhipiaoxinxiEntity> wrapper);
   	
}

