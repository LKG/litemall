package org.linlinjava.litemall.wx.dto;

import lombok.Data;

@Data
public class WxLoginInfo {
    private String code;
    private UserInfo userInfo;
}
