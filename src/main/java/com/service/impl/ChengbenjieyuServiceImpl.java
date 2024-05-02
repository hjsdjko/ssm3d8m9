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


import com.dao.ChengbenjieyuDao;
import com.entity.ChengbenjieyuEntity;
import com.service.ChengbenjieyuService;
import com.entity.vo.ChengbenjieyuVO;
import com.entity.view.ChengbenjieyuView;

@Service("chengbenjieyuService")
public class ChengbenjieyuServiceImpl extends ServiceImpl<ChengbenjieyuDao, ChengbenjieyuEntity> implements ChengbenjieyuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChengbenjieyuEntity> page = this.selectPage(
                new Query<ChengbenjieyuEntity>(params).getPage(),
                new EntityWrapper<ChengbenjieyuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChengbenjieyuEntity> wrapper) {
		  Page<ChengbenjieyuView> page =new Query<ChengbenjieyuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChengbenjieyuVO> selectListVO(Wrapper<ChengbenjieyuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChengbenjieyuVO selectVO(Wrapper<ChengbenjieyuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChengbenjieyuView> selectListView(Wrapper<ChengbenjieyuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChengbenjieyuView selectView(Wrapper<ChengbenjieyuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
