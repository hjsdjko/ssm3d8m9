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


import com.dao.YuangongguanliDao;
import com.entity.YuangongguanliEntity;
import com.service.YuangongguanliService;
import com.entity.vo.YuangongguanliVO;
import com.entity.view.YuangongguanliView;

@Service("yuangongguanliService")
public class YuangongguanliServiceImpl extends ServiceImpl<YuangongguanliDao, YuangongguanliEntity> implements YuangongguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuangongguanliEntity> page = this.selectPage(
                new Query<YuangongguanliEntity>(params).getPage(),
                new EntityWrapper<YuangongguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuangongguanliEntity> wrapper) {
		  Page<YuangongguanliView> page =new Query<YuangongguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuangongguanliVO> selectListVO(Wrapper<YuangongguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuangongguanliVO selectVO(Wrapper<YuangongguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuangongguanliView> selectListView(Wrapper<YuangongguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuangongguanliView selectView(Wrapper<YuangongguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
