package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoyuankebiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoyuankebiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoyuankebiaoView;


/**
 * 校园课表
 *
 * @author 
 * @email 
 * @date 2023-03-10 14:58:40
 */
public interface XiaoyuankebiaoService extends IService<XiaoyuankebiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoyuankebiaoVO> selectListVO(Wrapper<XiaoyuankebiaoEntity> wrapper);
   	
   	XiaoyuankebiaoVO selectVO(@Param("ew") Wrapper<XiaoyuankebiaoEntity> wrapper);
   	
   	List<XiaoyuankebiaoView> selectListView(Wrapper<XiaoyuankebiaoEntity> wrapper);
   	
   	XiaoyuankebiaoView selectView(@Param("ew") Wrapper<XiaoyuankebiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoyuankebiaoEntity> wrapper);
   	

}

