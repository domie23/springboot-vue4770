package com.dao;

import com.entity.DiscussxiaoyuankebiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxiaoyuankebiaoVO;
import com.entity.view.DiscussxiaoyuankebiaoView;


/**
 * 校园课表评论表
 * 
 * @author 
 * @email 
 * @date 2023-03-10 14:58:40
 */
public interface DiscussxiaoyuankebiaoDao extends BaseMapper<DiscussxiaoyuankebiaoEntity> {
	
	List<DiscussxiaoyuankebiaoVO> selectListVO(@Param("ew") Wrapper<DiscussxiaoyuankebiaoEntity> wrapper);
	
	DiscussxiaoyuankebiaoVO selectVO(@Param("ew") Wrapper<DiscussxiaoyuankebiaoEntity> wrapper);
	
	List<DiscussxiaoyuankebiaoView> selectListView(@Param("ew") Wrapper<DiscussxiaoyuankebiaoEntity> wrapper);

	List<DiscussxiaoyuankebiaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxiaoyuankebiaoEntity> wrapper);
	
	DiscussxiaoyuankebiaoView selectView(@Param("ew") Wrapper<DiscussxiaoyuankebiaoEntity> wrapper);
	

}
