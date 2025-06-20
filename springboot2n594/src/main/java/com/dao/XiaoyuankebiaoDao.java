package com.dao;

import com.entity.XiaoyuankebiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoyuankebiaoVO;
import com.entity.view.XiaoyuankebiaoView;


/**
 * 校园课表
 * 
 * @author 
 * @email 
 * @date 2023-03-10 14:58:40
 */
public interface XiaoyuankebiaoDao extends BaseMapper<XiaoyuankebiaoEntity> {
	
	List<XiaoyuankebiaoVO> selectListVO(@Param("ew") Wrapper<XiaoyuankebiaoEntity> wrapper);
	
	XiaoyuankebiaoVO selectVO(@Param("ew") Wrapper<XiaoyuankebiaoEntity> wrapper);
	
	List<XiaoyuankebiaoView> selectListView(@Param("ew") Wrapper<XiaoyuankebiaoEntity> wrapper);

	List<XiaoyuankebiaoView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoyuankebiaoEntity> wrapper);
	
	XiaoyuankebiaoView selectView(@Param("ew") Wrapper<XiaoyuankebiaoEntity> wrapper);
	

}
