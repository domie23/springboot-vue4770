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


import com.dao.DiscussxiaoyuankebiaoDao;
import com.entity.DiscussxiaoyuankebiaoEntity;
import com.service.DiscussxiaoyuankebiaoService;
import com.entity.vo.DiscussxiaoyuankebiaoVO;
import com.entity.view.DiscussxiaoyuankebiaoView;

@Service("discussxiaoyuankebiaoService")
public class DiscussxiaoyuankebiaoServiceImpl extends ServiceImpl<DiscussxiaoyuankebiaoDao, DiscussxiaoyuankebiaoEntity> implements DiscussxiaoyuankebiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxiaoyuankebiaoEntity> page = this.selectPage(
                new Query<DiscussxiaoyuankebiaoEntity>(params).getPage(),
                new EntityWrapper<DiscussxiaoyuankebiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxiaoyuankebiaoEntity> wrapper) {
		  Page<DiscussxiaoyuankebiaoView> page =new Query<DiscussxiaoyuankebiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxiaoyuankebiaoVO> selectListVO(Wrapper<DiscussxiaoyuankebiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxiaoyuankebiaoVO selectVO(Wrapper<DiscussxiaoyuankebiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxiaoyuankebiaoView> selectListView(Wrapper<DiscussxiaoyuankebiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxiaoyuankebiaoView selectView(Wrapper<DiscussxiaoyuankebiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
