package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuangongguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuangongguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangongguanliView;


/**
 * 员工管理
 *
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
public interface YuangongguanliService extends IService<YuangongguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuangongguanliVO> selectListVO(Wrapper<YuangongguanliEntity> wrapper);
   	
   	YuangongguanliVO selectVO(@Param("ew") Wrapper<YuangongguanliEntity> wrapper);
   	
   	List<YuangongguanliView> selectListView(Wrapper<YuangongguanliEntity> wrapper);
   	
   	YuangongguanliView selectView(@Param("ew") Wrapper<YuangongguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuangongguanliEntity> wrapper);
   	
}

