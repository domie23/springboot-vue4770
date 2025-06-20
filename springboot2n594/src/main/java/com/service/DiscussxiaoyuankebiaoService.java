package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxiaoyuankebiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxiaoyuankebiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxiaoyuankebiaoView;


/**
 * 校园课表评论表
 *
 * @author 
 * @email 
 * @date 2023-03-10 14:58:40
 */
public interface DiscussxiaoyuankebiaoService extends IService<DiscussxiaoyuankebiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxiaoyuankebiaoVO> selectListVO(Wrapper<DiscussxiaoyuankebiaoEntity> wrapper);
   	
   	DiscussxiaoyuankebiaoVO selectVO(@Param("ew") Wrapper<DiscussxiaoyuankebiaoEntity> wrapper);
   	
   	List<DiscussxiaoyuankebiaoView> selectListView(Wrapper<DiscussxiaoyuankebiaoEntity> wrapper);
   	
   	DiscussxiaoyuankebiaoView selectView(@Param("ew") Wrapper<DiscussxiaoyuankebiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxiaoyuankebiaoEntity> wrapper);
   	

}

