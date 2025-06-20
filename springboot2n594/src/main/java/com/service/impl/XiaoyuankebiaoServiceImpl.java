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


import com.dao.XiaoyuankebiaoDao;
import com.entity.XiaoyuankebiaoEntity;
import com.service.XiaoyuankebiaoService;
import com.entity.vo.XiaoyuankebiaoVO;
import com.entity.view.XiaoyuankebiaoView;

@Service("xiaoyuankebiaoService")
public class XiaoyuankebiaoServiceImpl extends ServiceImpl<XiaoyuankebiaoDao, XiaoyuankebiaoEntity> implements XiaoyuankebiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoyuankebiaoEntity> page = this.selectPage(
                new Query<XiaoyuankebiaoEntity>(params).getPage(),
                new EntityWrapper<XiaoyuankebiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoyuankebiaoEntity> wrapper) {
		  Page<XiaoyuankebiaoView> page =new Query<XiaoyuankebiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoyuankebiaoVO> selectListVO(Wrapper<XiaoyuankebiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoyuankebiaoVO selectVO(Wrapper<XiaoyuankebiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoyuankebiaoView> selectListView(Wrapper<XiaoyuankebiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoyuankebiaoView selectView(Wrapper<XiaoyuankebiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
