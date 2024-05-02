package com.dao;

import com.entity.ShangpinkucunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpinkucunVO;
import com.entity.view.ShangpinkucunView;


/**
 * 商品库存
 * 
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
public interface ShangpinkucunDao extends BaseMapper<ShangpinkucunEntity> {
	
	List<ShangpinkucunVO> selectListVO(@Param("ew") Wrapper<ShangpinkucunEntity> wrapper);
	
	ShangpinkucunVO selectVO(@Param("ew") Wrapper<ShangpinkucunEntity> wrapper);
	
	List<ShangpinkucunView> selectListView(@Param("ew") Wrapper<ShangpinkucunEntity> wrapper);

	List<ShangpinkucunView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinkucunEntity> wrapper);
	
	ShangpinkucunView selectView(@Param("ew") Wrapper<ShangpinkucunEntity> wrapper);
	
}
