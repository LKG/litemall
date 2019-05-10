package org.linlinjava.litemall.admin.vo;

import com.google.common.collect.Lists;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
@Data
public class StatVo {
    private String[] columns = new String[0];
    private List<Map> rows = Lists.newArrayList();

    public void add(Map... r) {
        rows.addAll(Arrays.asList(r));
    }
}
