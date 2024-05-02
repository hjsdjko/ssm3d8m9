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


import com.dao.FapiaoxinxiDao;
import com.entity.FapiaoxinxiEntity;
import com.service.FapiaoxinxiService;
import com.entity.vo.FapiaoxinxiVO;
import com.entity.view.FapiaoxinxiView;

@Service("fapiaoxinxiService")
public class FapiaoxinxiServiceImpl extends ServiceImpl<FapiaoxinxiDao, FapiaoxinxiEntity> implements FapiaoxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FapiaoxinxiEntity> page = this.selectPage(
                new Query<FapiaoxinxiEntity>(params).getPage(),
                new EntityWrapper<FapiaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FapiaoxinxiEntity> wrapper) {
		  Page<FapiaoxinxiView> page =new Query<FapiaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FapiaoxinxiVO> selectListVO(Wrapper<FapiaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FapiaoxinxiVO selectVO(Wrapper<FapiaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FapiaoxinxiView> selectListView(Wrapper<FapiaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FapiaoxinxiView selectView(Wrapper<FapiaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
