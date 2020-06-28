package com.yangq.selfmotivation.controller;

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
        return articleService.queryArticleList();
    }
}
