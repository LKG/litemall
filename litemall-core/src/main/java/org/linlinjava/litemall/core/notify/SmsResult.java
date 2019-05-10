package org.linlinjava.litemall.core.notify;

import lombok.Data;

/**
 * 发送短信的返回结果
 */
@Data
public class SmsResult {
    /**
     * 短信是否发送成功
     */
    private boolean successful;
    private Object result;
}
