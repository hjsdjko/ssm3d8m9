package com.dao;

import com.entity.JizhangpingzhengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JizhangpingzhengVO;
import com.entity.view.JizhangpingzhengView;


/**
 * 记账凭证
 * 
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
public interface JizhangpingzhengDao extends BaseMapper<JizhangpingzhengEntity> {
	
	List<JizhangpingzhengVO> selectListVO(@Param("ew") Wrapper<JizhangpingzhengEntity> wrapper);
	
	JizhangpingzhengVO selectVO(@Param("ew") Wrapper<JizhangpingzhengEntity> wrapper);
	
	List<JizhangpingzhengView> selectListView(@Param("ew") Wrapper<JizhangpingzhengEntity> wrapper);

	List<JizhangpingzhengView> selectListView(Pagination page,@Param("ew") Wrapper<JizhangpingzhengEntity> wrapper);
	
	JizhangpingzhengView selectView(@Param("ew") Wrapper<JizhangpingzhengEntity> wrapper);
	
}
