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


import com.dao.ShangpinkucunDao;
import com.entity.ShangpinkucunEntity;
import com.service.ShangpinkucunService;
import com.entity.vo.ShangpinkucunVO;
import com.entity.view.ShangpinkucunView;

@Service("shangpinkucunService")
public class ShangpinkucunServiceImpl extends ServiceImpl<ShangpinkucunDao, ShangpinkucunEntity> implements ShangpinkucunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangpinkucunEntity> page = this.selectPage(
                new Query<ShangpinkucunEntity>(params).getPage(),
                new EntityWrapper<ShangpinkucunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpinkucunEntity> wrapper) {
		  Page<ShangpinkucunView> page =new Query<ShangpinkucunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangpinkucunVO> selectListVO(Wrapper<ShangpinkucunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangpinkucunVO selectVO(Wrapper<ShangpinkucunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangpinkucunView> selectListView(Wrapper<ShangpinkucunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpinkucunView selectView(Wrapper<ShangpinkucunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
