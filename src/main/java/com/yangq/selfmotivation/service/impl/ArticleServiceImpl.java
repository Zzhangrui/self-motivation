package com.yangq.selfmotivation.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.yangq.selfmotivation.contants.ElasticsearchConstant;
import com.yangq.selfmotivation.dao.mapper.CmsArticleMapper;
import com.yangq.selfmotivation.dao.po.CmsArticle;
import com.yangq.selfmotivation.dao.po.CmsColumn;
import com.yangq.selfmotivation.dao.po.query.QCmsArticle;
import com.yangq.selfmotivation.dao.po.query.QCmsColumn;
import com.yangq.selfmotivation.service.ArticleService;
import com.yangq.selfmotivation.service.base.BaseElasticsearchService;
import com.yangq.selfmotivation.vo.JsonResult;
import org.apache.lucene.queryparser.xml.builders.BooleanQueryBuilder;
import org.apache.lucene.search.BooleanQuery;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author Zhangr
 * date 2020-06-28
 * @Description :
 */
@Service
public class ArticleServiceImpl extends BaseElasticsearchService implements ArticleService {

    @Autowired
    private CmsArticleMapper articleMapper;

    @Override
    public JsonResult queryArticleList() {
        return JsonResult.success(articleMapper.selectAll());
    }

    @Override
    public CmsArticle queryArticleById(Integer id) {
        if (null == id) {
            id = 12;
        }
        return new QCmsArticle().id.equalTo(id).query().findOne();
    }

    /**
     * 查询栏目
     *
     * @return
     */
    @Override
    public CmsColumn queryColumnList() {
        CmsColumn cmsColumn = new QCmsColumn().id.equalTo(1L).query().findOne();
        return cmsColumn;

    }

    @Override
    public JsonResult insert(CmsArticle article) {
        articleMapper.insert(article);
        IndexRequest request = buildIndexRequest(ElasticsearchConstant.INDEX_NAME, String.valueOf(article.getId()), article);
        try {
            client.index(request, COMMON_OPTIONS);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return JsonResult.SUCCESS;
    }



    @Override
    public JsonResult update(CmsArticle cmsArticle) {
        return null;
    }

    @Override
    public JsonResult delete(CmsArticle cmsArticle) {
        return null;
    }

    @Override
    public JsonResult queryByEs(String title) {
        SearchRequest searchRequest = new SearchRequest(ElasticsearchConstant.INDEX_NAME);
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.termQuery("artTitle",title));
        searchRequest.source(searchSourceBuilder);
        SearchResponse searchResponse = null;
        try {
            searchResponse = client.search(searchRequest, COMMON_OPTIONS);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SearchHit[] hits = searchResponse.getHits().getHits();
        List<CmsArticle> articleList = new ArrayList<>();
        Arrays.stream(hits).forEach(hit -> {
            Map<String, Object> sourceAsMap = hit.getSourceAsMap();
            CmsArticle person = BeanUtil.mapToBean(sourceAsMap, CmsArticle.class, true);
            articleList.add(person);
        });
        return JsonResult.success(articleList);
    }
}
