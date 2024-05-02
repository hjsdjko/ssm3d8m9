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


import com.dao.JizhangpingzhengDao;
import com.entity.JizhangpingzhengEntity;
import com.service.JizhangpingzhengService;
import com.entity.vo.JizhangpingzhengVO;
import com.entity.view.JizhangpingzhengView;

@Service("jizhangpingzhengService")
public class JizhangpingzhengServiceImpl extends ServiceImpl<JizhangpingzhengDao, JizhangpingzhengEntity> implements JizhangpingzhengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JizhangpingzhengEntity> page = this.selectPage(
                new Query<JizhangpingzhengEntity>(params).getPage(),
                new EntityWrapper<JizhangpingzhengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JizhangpingzhengEntity> wrapper) {
		  Page<JizhangpingzhengView> page =new Query<JizhangpingzhengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JizhangpingzhengVO> selectListVO(Wrapper<JizhangpingzhengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JizhangpingzhengVO selectVO(Wrapper<JizhangpingzhengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JizhangpingzhengView> selectListView(Wrapper<JizhangpingzhengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JizhangpingzhengView selectView(Wrapper<JizhangpingzhengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
