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


import com.dao.YuangongjiaokuanDao;
import com.entity.YuangongjiaokuanEntity;
import com.service.YuangongjiaokuanService;
import com.entity.vo.YuangongjiaokuanVO;
import com.entity.view.YuangongjiaokuanView;

@Service("yuangongjiaokuanService")
public class YuangongjiaokuanServiceImpl extends ServiceImpl<YuangongjiaokuanDao, YuangongjiaokuanEntity> implements YuangongjiaokuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuangongjiaokuanEntity> page = this.selectPage(
                new Query<YuangongjiaokuanEntity>(params).getPage(),
                new EntityWrapper<YuangongjiaokuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuangongjiaokuanEntity> wrapper) {
		  Page<YuangongjiaokuanView> page =new Query<YuangongjiaokuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuangongjiaokuanVO> selectListVO(Wrapper<YuangongjiaokuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuangongjiaokuanVO selectVO(Wrapper<YuangongjiaokuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuangongjiaokuanView> selectListView(Wrapper<YuangongjiaokuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuangongjiaokuanView selectView(Wrapper<YuangongjiaokuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
