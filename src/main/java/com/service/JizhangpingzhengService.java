package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JizhangpingzhengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JizhangpingzhengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JizhangpingzhengView;


/**
 * 记账凭证
 *
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
public interface JizhangpingzhengService extends IService<JizhangpingzhengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JizhangpingzhengVO> selectListVO(Wrapper<JizhangpingzhengEntity> wrapper);
   	
   	JizhangpingzhengVO selectVO(@Param("ew") Wrapper<JizhangpingzhengEntity> wrapper);
   	
   	List<JizhangpingzhengView> selectListView(Wrapper<JizhangpingzhengEntity> wrapper);
   	
   	JizhangpingzhengView selectView(@Param("ew") Wrapper<JizhangpingzhengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JizhangpingzhengEntity> wrapper);
   	
}

