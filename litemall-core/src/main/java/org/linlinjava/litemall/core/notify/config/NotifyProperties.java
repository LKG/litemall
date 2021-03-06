package org.linlinjava.litemall.core.notify.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "litemall.notify")
@Data
public class NotifyProperties {
    private Mail mail;
    private Sms sms;
    private Wx wx;
    @Data
    public static class Mail {
        private boolean enable;
        private String host;
        private String username;
        private String password;
        private String sendfrom;
        private String sendto;
    }
    @Data
    public static class Sms {
        private boolean enable;
        private int appid;
        private String appkey;
        private List<Map<String, String>> template = new ArrayList<>();
    }
    @Data
    public static class Wx {
        private boolean enable;
        private List<Map<String, String>> template = new ArrayList<>();
    }

}
