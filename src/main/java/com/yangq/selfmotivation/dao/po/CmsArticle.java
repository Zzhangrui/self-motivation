package com.yangq.selfmotivation.dao.po;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import io.ebean.Model;
import lombok.Data;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`cms_article`")
@Entity
@Data
public class CmsArticle extends Model {
    /**
     * id主键
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 标题
     */
    @Column(name = "`art_title`")
    private String artTitle;

    /**
     * 摘要
     */
    @Column(name = "`art_digest`")
    private String artDigest;

    /**
     * 来源
     */
    @Column(name = "`art_from`")
    private String artFrom;

    @Column(name = "`art_author`")
    private String artAuthor;

    /**
     * 网站id
     */
    @Column(name = "`web_id`")
    private Integer webId;

    /**
     * 栏目Id
     */
    @Column(name = "`cate_id`")
    private Integer cateId;

    /**
     * 创建时间
     */
    @Column(name = "`create_time`")
    private Date createTime;

    @Column(name = "`create_username`")
    private String createUsername;

    /**
     * 创建人id
     */
    @Column(name = "`create_user_id`")
    private Integer createUserId;

    /**
     * 发布时间
     */
    @Column(name = "`publish_time`")
    private Date publishTime;

    @Column(name = "`publish_username`")
    private String publishUsername;

    /**
     * 发布人id
     */
    @Column(name = "`publish_user_id`")
    private String publishUserId;

    /**
     * 是否置顶
     */
    @Column(name = "`art_top`")
    private Integer artTop;

    /**
     * 状态
     */
    @Column(name = "`art_state`")
    private Integer artState;

    /**
     * 显示开始时间
     */
    @Column(name = "`show_start_time`")
    private Date showStartTime;

    /**
     * 显示结束时间
     */
    @Column(name = "`show_end_time`")
    private Date showEndTime;

    /**
     * 开启评论
     */
    @Column(name = "`open_commen`")
    private Integer openCommen;

    /**
     * 栏目id
     */
    @Column(name = "`colu_id`")
    private Integer coluId;

    /**
     * 栏目名称
     */
    @Column(name = "`colu_name`")
    private String coluName;

    @Column(name = "`create_group_id`")
    private Integer createGroupId;

    @Column(name = "`create_group_name`")
    private String createGroupName;

    /**
     * 内容
     */
    @Column(name = "`art_content`")
    private String artContent;

    @ManyToOne(optional=false)
    @JoinColumn(name = "colu_id",insertable = false, updatable = false, nullable=true)
    @JsonIgnoreProperties("articleList")
    private CmsColumn cmsColumn;
}