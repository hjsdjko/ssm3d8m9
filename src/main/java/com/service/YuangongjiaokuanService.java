package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuangongjiaokuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuangongjiaokuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangongjiaokuanView;


/**
 * 员工缴款
 *
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
public interface YuangongjiaokuanService extends IService<YuangongjiaokuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuangongjiaokuanVO> selectListVO(Wrapper<YuangongjiaokuanEntity> wrapper);
   	
   	YuangongjiaokuanVO selectVO(@Param("ew") Wrapper<YuangongjiaokuanEntity> wrapper);
   	
   	List<YuangongjiaokuanView> selectListView(Wrapper<YuangongjiaokuanEntity> wrapper);
   	
   	YuangongjiaokuanView selectView(@Param("ew") Wrapper<YuangongjiaokuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuangongjiaokuanEntity> wrapper);
   	
}

