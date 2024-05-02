package com.dao;

import com.entity.ChengbenjieyuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChengbenjieyuVO;
import com.entity.view.ChengbenjieyuView;


/**
 * 成本结余
 * 
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
public interface ChengbenjieyuDao extends BaseMapper<ChengbenjieyuEntity> {
	
	List<ChengbenjieyuVO> selectListVO(@Param("ew") Wrapper<ChengbenjieyuEntity> wrapper);
	
	ChengbenjieyuVO selectVO(@Param("ew") Wrapper<ChengbenjieyuEntity> wrapper);
	
	List<ChengbenjieyuView> selectListView(@Param("ew") Wrapper<ChengbenjieyuEntity> wrapper);

	List<ChengbenjieyuView> selectListView(Pagination page,@Param("ew") Wrapper<ChengbenjieyuEntity> wrapper);
	
	ChengbenjieyuView selectView(@Param("ew") Wrapper<ChengbenjieyuEntity> wrapper);
	
}
