package com.dao;

import com.entity.ZhipiaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhipiaoxinxiVO;
import com.entity.view.ZhipiaoxinxiView;


/**
 * 支票信息
 * 
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
public interface ZhipiaoxinxiDao extends BaseMapper<ZhipiaoxinxiEntity> {
	
	List<ZhipiaoxinxiVO> selectListVO(@Param("ew") Wrapper<ZhipiaoxinxiEntity> wrapper);
	
	ZhipiaoxinxiVO selectVO(@Param("ew") Wrapper<ZhipiaoxinxiEntity> wrapper);
	
	List<ZhipiaoxinxiView> selectListView(@Param("ew") Wrapper<ZhipiaoxinxiEntity> wrapper);

	List<ZhipiaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhipiaoxinxiEntity> wrapper);
	
	ZhipiaoxinxiView selectView(@Param("ew") Wrapper<ZhipiaoxinxiEntity> wrapper);
	
}
