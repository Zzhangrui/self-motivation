package com.yangq.selfmotivation.controller;

import com.sun.xml.internal.ws.api.FeatureListValidatorAnnotation;
import com.yangq.selfmotivation.dao.po.CmsArticle;
import com.yangq.selfmotivation.dao.po.CmsColumn;
import com.yangq.selfmotivation.dao.po.query.QCmsColumn;
import com.yangq.selfmotivation.service.ArticleService;
import com.yangq.selfmotivation.vo.JsonResult;
import io.ebean.DB;
import io.ebean.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Zhangr
 * date 2020-06-28
 * @Description :
 */
@RestController
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @Value("${env-level}")
    private String envLevel;

    @GetMapping("index")
    @Transactional
    public JsonResult index() {
        List<CmsColumn> cmsColumnList = new QCmsColumn().coluName.ilike("%检查%").findList();
        return JsonResult.success(cmsColumnList);
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
