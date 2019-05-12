package com.yu.service.impl;

import com.yu.domain.Title;
import com.yu.service.TitleService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;



/**
 * @author YuGY
 * @date 2019/05/12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TitleServiceImplTest {
    
    @Autowired
    TitleService titleService;
    
    @Test
    public void findAll() throws Exception {
        List<Title> titleList = titleService.findAll();
        Assert.assertNotEquals(0,titleList.size());
    
    }
}