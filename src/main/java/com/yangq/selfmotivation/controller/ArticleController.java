package com.yangq.selfmotivation.controller;

import com.yangq.selfmotivation.dao.po.CmsArticle;
import com.yangq.selfmotivation.service.ArticleService;
import com.yangq.selfmotivation.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("index")
    public JsonResult index() {
        return articleService.queryByEs("2[3");
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
