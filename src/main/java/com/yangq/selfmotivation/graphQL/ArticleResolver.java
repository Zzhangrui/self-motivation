package com.yangq.selfmotivation.graphQL;

import com.yangq.selfmotivation.dao.po.CmsArticle;
import com.yangq.selfmotivation.dao.po.CmsColumn;
import graphql.kickstart.tools.GraphQLResolver;

/**
 * GraphQL 对象绑定
 */
public class ArticleResolver implements GraphQLResolver<CmsArticle> {

    public CmsColumn column(CmsArticle article){
        return article.getCmsColumn();
    }
}
