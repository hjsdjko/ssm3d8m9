package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.RijizhangDao;
import com.entity.RijizhangEntity;
import com.service.RijizhangService;
import com.entity.vo.RijizhangVO;
import com.entity.view.RijizhangView;

@Service("rijizhangService")
public class RijizhangServiceImpl extends ServiceImpl<RijizhangDao, RijizhangEntity> implements RijizhangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RijizhangEntity> page = this.selectPage(
                new Query<RijizhangEntity>(params).getPage(),
                new EntityWrapper<RijizhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RijizhangEntity> wrapper) {
		  Page<RijizhangView> page =new Query<RijizhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RijizhangVO> selectListVO(Wrapper<RijizhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RijizhangVO selectVO(Wrapper<RijizhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RijizhangView> selectListView(Wrapper<RijizhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RijizhangView selectView(Wrapper<RijizhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
