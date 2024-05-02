package com.dao;

import com.entity.FapiaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FapiaoxinxiVO;
import com.entity.view.FapiaoxinxiView;


/**
 * 发票信息
 * 
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
public interface FapiaoxinxiDao extends BaseMapper<FapiaoxinxiEntity> {
	
	List<FapiaoxinxiVO> selectListVO(@Param("ew") Wrapper<FapiaoxinxiEntity> wrapper);
	
	FapiaoxinxiVO selectVO(@Param("ew") Wrapper<FapiaoxinxiEntity> wrapper);
	
	List<FapiaoxinxiView> selectListView(@Param("ew") Wrapper<FapiaoxinxiEntity> wrapper);

	List<FapiaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<FapiaoxinxiEntity> wrapper);
	
	FapiaoxinxiView selectView(@Param("ew") Wrapper<FapiaoxinxiEntity> wrapper);
	
}
