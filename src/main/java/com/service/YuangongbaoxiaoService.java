package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuangongbaoxiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuangongbaoxiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangongbaoxiaoView;


/**
 * 员工报销
 *
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
public interface YuangongbaoxiaoService extends IService<YuangongbaoxiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuangongbaoxiaoVO> selectListVO(Wrapper<YuangongbaoxiaoEntity> wrapper);
   	
   	YuangongbaoxiaoVO selectVO(@Param("ew") Wrapper<YuangongbaoxiaoEntity> wrapper);
   	
   	List<YuangongbaoxiaoView> selectListView(Wrapper<YuangongbaoxiaoEntity> wrapper);
   	
   	YuangongbaoxiaoView selectView(@Param("ew") Wrapper<YuangongbaoxiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuangongbaoxiaoEntity> wrapper);
   	
}

