package com.dao;

import com.entity.YuangongjiaokuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuangongjiaokuanVO;
import com.entity.view.YuangongjiaokuanView;


/**
 * 员工缴款
 * 
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
public interface YuangongjiaokuanDao extends BaseMapper<YuangongjiaokuanEntity> {
	
	List<YuangongjiaokuanVO> selectListVO(@Param("ew") Wrapper<YuangongjiaokuanEntity> wrapper);
	
	YuangongjiaokuanVO selectVO(@Param("ew") Wrapper<YuangongjiaokuanEntity> wrapper);
	
	List<YuangongjiaokuanView> selectListView(@Param("ew") Wrapper<YuangongjiaokuanEntity> wrapper);

	List<YuangongjiaokuanView> selectListView(Pagination page,@Param("ew") Wrapper<YuangongjiaokuanEntity> wrapper);
	
	YuangongjiaokuanView selectView(@Param("ew") Wrapper<YuangongjiaokuanEntity> wrapper);
	
}
