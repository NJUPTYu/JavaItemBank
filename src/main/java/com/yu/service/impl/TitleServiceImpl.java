package com.yu.service.impl;

import com.yu.domain.Title;
import com.yu.mapper.TitleMapper;
import com.yu.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author YuGY
 * @date 2019/05/11
 */
@Service
public class TitleServiceImpl implements TitleService{
    
    @Autowired
    TitleMapper titleMapper;
    
    @Override
    public List<Title> findAll() {
        
        return titleMapper.findAll();
    }
}
