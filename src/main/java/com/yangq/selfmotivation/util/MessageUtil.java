package com.yangq.selfmotivation.util;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * @Classname MessageUtil
 * @Description 发送短信验证码工具类
 * @Date 2020/8/3 4:07 下午
 * @Created by Rui.Zhang
 */
@Component
@Slf4j
public class MessageUtil {



    public String sendContractNotice(String mobile, String content) {
        //短信下发
        String sendUrl = "http://smssh1.253.com/msg/send/json";
        Map map = buildMessageConfig();
        map.put("msg", content);//短信内容
        map.put("phone", mobile);//手机号
        //map.put("extend", "123");//自定义扩展码
        JSONObject jsonObject = JSONUtil.parseObj(map);
        return sendSmsByPost(sendUrl, jsonObject.toString());
    }

    /**
     * 发送短信验证码
     *
     * @param phone
     * @param code
     * @return
     */
    public String sendVerifyComeMsg(String phone, String code) {
        //短信下发
        String sendUrl = "http://smssh1.253.com/msg/send/json";
        Map map = buildMessageConfig();
        map.put("msg", "尊敬的用户，您的验证码为5731");//短信内容
        map.put("phone", "18305172623");//手机号
        //map.put("extend", "123");//自定义扩展码
        JSONObject jsonObject = JSONUtil.parseObj(map);
        return sendSmsByPost(sendUrl, jsonObject.toString());
    }

    /**
     * build 发送短信配置Map
     *
     * @return
     */
    private Map buildMessageConfig() {
        Map map = new HashMap();
        map.put("account", "N062210_N7467023");//API账号
        map.put("password", "bnU4fB0Yer17e9");//API密码
        map.put("report", "true");
        return map;
    }

    /**
     * 构造发送短信体
     *
     * @param path
     * @param postContent
     * @return
     */
    private String sendSmsByPost(String path, String postContent) {
        URL url = null;
        try {
            url = new URL(path);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestProperty("Charset", "UTF-8");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.connect();
            OutputStream os = httpURLConnection.getOutputStream();
            os.write(postContent.getBytes("UTF-8"));
            os.flush();
            StringBuilder sb = new StringBuilder();
            int httpRspCode = httpURLConnection.getResponseCode();
            if (httpRspCode == HttpURLConnection.HTTP_OK) {
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
                String line = null;
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                }
                br.close();
                log.info("send message request param is {}, result is {}", postContent, sb.toString());
                return sb.toString();
            }
        } catch (Exception e) {
            log.error("send message error,url is {},param is {}", path, postContent);
            e.printStackTrace();
        }
        return StrUtil.EMPTY;
    }
}
