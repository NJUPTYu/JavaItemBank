package com.yu.mapper;

import com.yu.domain.Title;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * @author YuGY
 * @date 2019/05/11
 */
@Mapper
public interface TitleMapper {
    /**
     *查询出所有的题
     */
    @Select("SELECT * FROM title")
    List<Title> findAll();
    
    /**
     * 按照类型查询题
     */
    //List<Title> findByType();
    
    /**
     * 按照作者查询题
     */
    //List<Title> findByAuthor();
    
    /**
     *按照id查询题
     */
    //Title finById();
    
    //按照关键字查找
    
    //随机弹出一道题
    
}
