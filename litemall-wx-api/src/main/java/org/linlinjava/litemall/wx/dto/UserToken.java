package org.linlinjava.litemall.wx.dto;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class UserToken {
    private Integer userId;
    private String token;
    private String sessionKey;
    private LocalDateTime expireTime;
    private LocalDateTime updateTime;
}
