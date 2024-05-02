package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RijizhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RijizhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RijizhangView;


/**
 * 日记账
 *
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
public interface RijizhangService extends IService<RijizhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RijizhangVO> selectListVO(Wrapper<RijizhangEntity> wrapper);
   	
   	RijizhangVO selectVO(@Param("ew") Wrapper<RijizhangEntity> wrapper);
   	
   	List<RijizhangView> selectListView(Wrapper<RijizhangEntity> wrapper);
   	
   	RijizhangView selectView(@Param("ew") Wrapper<RijizhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RijizhangEntity> wrapper);
   	
}

