package com.yu.service;

import com.yu.domain.Title;

import java.util.List;

/**
 * @author YuGY
 * @date 2019/05/11
 */
public interface TitleService {
    
    /**
     * 查询出所有的题
     * @return
     */
    List<Title> findAll();
}
