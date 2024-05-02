package com.dao;

import com.entity.GongyingshangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongyingshangxinxiVO;
import com.entity.view.GongyingshangxinxiView;


/**
 * 供应商信息
 * 
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
public interface GongyingshangxinxiDao extends BaseMapper<GongyingshangxinxiEntity> {
	
	List<GongyingshangxinxiVO> selectListVO(@Param("ew") Wrapper<GongyingshangxinxiEntity> wrapper);
	
	GongyingshangxinxiVO selectVO(@Param("ew") Wrapper<GongyingshangxinxiEntity> wrapper);
	
	List<GongyingshangxinxiView> selectListView(@Param("ew") Wrapper<GongyingshangxinxiEntity> wrapper);

	List<GongyingshangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GongyingshangxinxiEntity> wrapper);
	
	GongyingshangxinxiView selectView(@Param("ew") Wrapper<GongyingshangxinxiEntity> wrapper);
	
}
