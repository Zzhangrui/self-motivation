package com.yangq.selfmotivation.controller;

import cn.hutool.core.date.DateUtil;
import com.yangq.selfmotivation.dao.po.CmsArticle;
import com.yangq.selfmotivation.dao.po.query.QCmsArticle;
import com.yangq.selfmotivation.dao.po.query.QCmsColumn;
import com.yangq.selfmotivation.service.ArticleService;
import com.yangq.selfmotivation.vo.JsonResult;
import io.ebean.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhangr
 * date 2020-06-28
 * @Description :
 */
@RestController
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @Autowired
    private RedisTemplate redisTemplate;

    @Value("${env-level}")
    private String envLevel;

    @GetMapping("index")
    public JsonResult index() {
        //List<CmsColumn> cmsColumnList = new QCmsColumn().coluName.ilike("%检查%").findList();
        //System.out.println(JSONUtil.toJsonStr(new QCmsArticle().id.equalTo(12).query().findOne()));
        redisTemplate.opsForValue().set("test","包包是傻逼");
        return JsonResult.success(redisTemplate.opsForValue().get("test"));
    }

    @GetMapping("columnList")
    public JsonResult columnIndex(){
        return JsonResult.success(new QCmsColumn().findList());
    }

    @GetMapping("articleList")
    public JsonResult articleIndex(){
        return JsonResult.success(new QCmsArticle().findList());
    }

    @PostMapping("addArticle")
    @Transactional
    public JsonResult addArticle(@RequestBody CmsArticle cmsArticle){
        cmsArticle.setArtTitle("zhangrui jie dian  test "+ DateUtil.now());
        cmsArticle.save();
        return JsonResult.SUCCESS;
    }



    @GetMapping("insert")
    public JsonResult insert(){
        CmsArticle cmsArticle = new CmsArticle();
        cmsArticle.setArtTitle("test Title,张锐");
        cmsArticle.setArtContent("大家好，我是张锐，这里是Java客户端，我在test es");
        cmsArticle.setArtDigest("张锐");
        return articleService.insert(cmsArticle);
    }


}
