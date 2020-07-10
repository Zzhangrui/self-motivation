package com.yangq.selfmotivation.graphQL;

import com.yangq.selfmotivation.dao.po.CmsArticle;
import com.yangq.selfmotivation.dao.po.CmsColumn;
import com.yangq.selfmotivation.dao.po.query.QCmsArticle;
import com.yangq.selfmotivation.dao.po.query.QCmsColumn;
import com.yangq.selfmotivation.service.ArticleService;
import com.yangq.selfmotivation.vo.JsonResult;
import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.Validator;
import java.util.List;

/**
 * GraphQL root Query
 */
@Slf4j
@Component
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class Query implements GraphQLQueryResolver {
    private final Validator validator;
    private final ArticleService articleService;

    public List<CmsArticle> queryArticleList(Integer offset, Integer limit,Integer id, DataFetchingEnvironment env) {
        //QCms.
        //Integer id = env.getArgument("id");
        return new QCmsArticle().findList();
    }

    public List<CmsColumn> queryColumnList(){
        return new QCmsColumn().findList();
    }
}
