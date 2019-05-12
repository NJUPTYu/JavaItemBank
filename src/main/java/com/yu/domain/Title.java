package com.yu.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author YuGY
 * @date 2019/05/10
 */
@Setter
@Getter
public class Title {
    public long id;
    public String author;
    public String question;
    public String answer;
    public int type;
}
