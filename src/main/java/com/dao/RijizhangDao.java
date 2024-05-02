package com.dao;

import com.entity.RijizhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RijizhangVO;
import com.entity.view.RijizhangView;


/**
 * 日记账
 * 
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
public interface RijizhangDao extends BaseMapper<RijizhangEntity> {
	
	List<RijizhangVO> selectListVO(@Param("ew") Wrapper<RijizhangEntity> wrapper);
	
	RijizhangVO selectVO(@Param("ew") Wrapper<RijizhangEntity> wrapper);
	
	List<RijizhangView> selectListView(@Param("ew") Wrapper<RijizhangEntity> wrapper);

	List<RijizhangView> selectListView(Pagination page,@Param("ew") Wrapper<RijizhangEntity> wrapper);
	
	RijizhangView selectView(@Param("ew") Wrapper<RijizhangEntity> wrapper);
	
}
