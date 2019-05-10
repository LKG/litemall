package org.linlinjava.litemall.admin.vo;

import lombok.Data;

import java.util.List;
@Data
public class CategoryVo {
    private Integer id;
    private String name;
    private String keywords;
    private String desc;
    private String iconUrl;
    private String picUrl;
    private String level;
    private List<CategoryVo> children;
}
