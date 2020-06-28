package com.yangq.selfmotivation.service.impl;

import com.yangq.selfmotivation.dao.mapper.CmsArticleMapper;
import com.yangq.selfmotivation.service.ArticleService;
import com.yangq.selfmotivation.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Zhangr
 * date 2020-06-28
 * @Description :
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private CmsArticleMapper articleMapper;

    @Override
    public JsonResult queryArticleList() {
        return JsonResult.success(articleMapper.selectAll());
    }
}
