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


import com.dao.ZhipiaoxinxiDao;
import com.entity.ZhipiaoxinxiEntity;
import com.service.ZhipiaoxinxiService;
import com.entity.vo.ZhipiaoxinxiVO;
import com.entity.view.ZhipiaoxinxiView;

@Service("zhipiaoxinxiService")
public class ZhipiaoxinxiServiceImpl extends ServiceImpl<ZhipiaoxinxiDao, ZhipiaoxinxiEntity> implements ZhipiaoxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhipiaoxinxiEntity> page = this.selectPage(
                new Query<ZhipiaoxinxiEntity>(params).getPage(),
                new EntityWrapper<ZhipiaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhipiaoxinxiEntity> wrapper) {
		  Page<ZhipiaoxinxiView> page =new Query<ZhipiaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhipiaoxinxiVO> selectListVO(Wrapper<ZhipiaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhipiaoxinxiVO selectVO(Wrapper<ZhipiaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhipiaoxinxiView> selectListView(Wrapper<ZhipiaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhipiaoxinxiView selectView(Wrapper<ZhipiaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
