package com.yangq.selfmotivation.util;

import cn.hutool.core.date.DateUtil;
import cn.hutool.http.HttpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Rui.Zhang
 * @Classname ContractNoticeTask
 * @Description 合同提醒task
 * @Date 2020/8/18 4:45 下午
 */
@Component
@Slf4j
public class ContractNoticeTask {



    @Autowired
    private MessageUtil messageUtil;


    private final String CONTRACT_NOTICE = "你的编号为【{0}】企业名称为【{1}】的合同即将到期，请您及时跟进";

    /**
     * 定时任务  每天8点执行   轮询所有的数据库
     */
    @Scheduled(cron = "1/10 * * * * ?")
    //@Scheduled(cron = "0 * * * * ?")
    public void messageNotice() {
        String result = HttpUtil.get("https://www.louisvuitton.cn/zhs-cn/products/lv-crafty-neonoe-mm-nvprod2400126v");
        System.out.println(result);
        if(result.contains("<div id=\"notInStock\" class=\"hide getIndexClass\" data-index=\"\">")){
            System.out.println("有货"+ DateUtil.now());
            //System.out.println("还没有抢到"+ DateUtil.now());
        }else{
            System.out.println("没有货"+ DateUtil.now());
            //messageUtil.sendVerifyComeMsg("18305172623","1047");
        }

    }
}
