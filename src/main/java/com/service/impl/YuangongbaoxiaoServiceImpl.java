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


import com.dao.YuangongbaoxiaoDao;
import com.entity.YuangongbaoxiaoEntity;
import com.service.YuangongbaoxiaoService;
import com.entity.vo.YuangongbaoxiaoVO;
import com.entity.view.YuangongbaoxiaoView;

@Service("yuangongbaoxiaoService")
public class YuangongbaoxiaoServiceImpl extends ServiceImpl<YuangongbaoxiaoDao, YuangongbaoxiaoEntity> implements YuangongbaoxiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuangongbaoxiaoEntity> page = this.selectPage(
                new Query<YuangongbaoxiaoEntity>(params).getPage(),
                new EntityWrapper<YuangongbaoxiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuangongbaoxiaoEntity> wrapper) {
		  Page<YuangongbaoxiaoView> page =new Query<YuangongbaoxiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuangongbaoxiaoVO> selectListVO(Wrapper<YuangongbaoxiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuangongbaoxiaoVO selectVO(Wrapper<YuangongbaoxiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuangongbaoxiaoView> selectListView(Wrapper<YuangongbaoxiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuangongbaoxiaoView selectView(Wrapper<YuangongbaoxiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
