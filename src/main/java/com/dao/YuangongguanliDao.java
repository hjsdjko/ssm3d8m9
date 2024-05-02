package com.dao;

import com.entity.YuangongguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuangongguanliVO;
import com.entity.view.YuangongguanliView;


/**
 * 员工管理
 * 
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
public interface YuangongguanliDao extends BaseMapper<YuangongguanliEntity> {
	
	List<YuangongguanliVO> selectListVO(@Param("ew") Wrapper<YuangongguanliEntity> wrapper);
	
	YuangongguanliVO selectVO(@Param("ew") Wrapper<YuangongguanliEntity> wrapper);
	
	List<YuangongguanliView> selectListView(@Param("ew") Wrapper<YuangongguanliEntity> wrapper);

	List<YuangongguanliView> selectListView(Pagination page,@Param("ew") Wrapper<YuangongguanliEntity> wrapper);
	
	YuangongguanliView selectView(@Param("ew") Wrapper<YuangongguanliEntity> wrapper);
	
}
