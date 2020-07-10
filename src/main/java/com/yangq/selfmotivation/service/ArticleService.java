package com.yangq.selfmotivation.service;

import com.yangq.selfmotivation.dao.po.CmsArticle;
import com.yangq.selfmotivation.dao.po.CmsColumn;
import com.yangq.selfmotivation.vo.JsonResult;

/**
 * @author Zhangr
 * date 2020-06-28
 * @Description :
 */
public interface ArticleService  {

    JsonResult queryArticleList();

    CmsArticle queryArticleById(Integer id);
    /**
     * 查询栏目
     * @return
     */
    CmsColumn queryColumnList();

    JsonResult insert(CmsArticle article);

    JsonResult update(CmsArticle cmsArticle);

    JsonResult delete(CmsArticle cmsArticle);

    JsonResult queryByEs(String title);
}
