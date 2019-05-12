package com.yu.mapper;

import com.yu.domain.Title;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author YuGY
 * @date 2019/05/12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TitleMapperTest {
    
    @Autowired
    TitleMapper titleMapper;
    
    @Test
    public void findAll() throws Exception {
        List<Title> titleList = titleMapper.findAll();
        Assert.assertNotNull(titleList);
    }
    
}