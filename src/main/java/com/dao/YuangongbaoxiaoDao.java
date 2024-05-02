package com.dao;

import com.entity.YuangongbaoxiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuangongbaoxiaoVO;
import com.entity.view.YuangongbaoxiaoView;


/**
 * 员工报销
 * 
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
public interface YuangongbaoxiaoDao extends BaseMapper<YuangongbaoxiaoEntity> {
	
	List<YuangongbaoxiaoVO> selectListVO(@Param("ew") Wrapper<YuangongbaoxiaoEntity> wrapper);
	
	YuangongbaoxiaoVO selectVO(@Param("ew") Wrapper<YuangongbaoxiaoEntity> wrapper);
	
	List<YuangongbaoxiaoView> selectListView(@Param("ew") Wrapper<YuangongbaoxiaoEntity> wrapper);

	List<YuangongbaoxiaoView> selectListView(Pagination page,@Param("ew") Wrapper<YuangongbaoxiaoEntity> wrapper);
	
	YuangongbaoxiaoView selectView(@Param("ew") Wrapper<YuangongbaoxiaoEntity> wrapper);
	
}
