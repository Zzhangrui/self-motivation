package com.yangq.selfmotivation.dao.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`cms_article`")
public class CmsArticle {
    /**
     * id主键
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
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

    /**
     * 获取id主键
     *
     * @return id - id主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id主键
     *
     * @param id id主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取标题
     *
     * @return art_title - 标题
     */
    public String getArtTitle() {
        return artTitle;
    }

    /**
     * 设置标题
     *
     * @param artTitle 标题
     */
    public void setArtTitle(String artTitle) {
        this.artTitle = artTitle;
    }

    /**
     * 获取摘要
     *
     * @return art_digest - 摘要
     */
    public String getArtDigest() {
        return artDigest;
    }

    /**
     * 设置摘要
     *
     * @param artDigest 摘要
     */
    public void setArtDigest(String artDigest) {
        this.artDigest = artDigest;
    }

    /**
     * 获取来源
     *
     * @return art_from - 来源
     */
    public String getArtFrom() {
        return artFrom;
    }

    /**
     * 设置来源
     *
     * @param artFrom 来源
     */
    public void setArtFrom(String artFrom) {
        this.artFrom = artFrom;
    }

    /**
     * @return art_author
     */
    public String getArtAuthor() {
        return artAuthor;
    }

    /**
     * @param artAuthor
     */
    public void setArtAuthor(String artAuthor) {
        this.artAuthor = artAuthor;
    }

    /**
     * 获取网站id
     *
     * @return web_id - 网站id
     */
    public Integer getWebId() {
        return webId;
    }

    /**
     * 设置网站id
     *
     * @param webId 网站id
     */
    public void setWebId(Integer webId) {
        this.webId = webId;
    }

    /**
     * 获取栏目Id
     *
     * @return cate_id - 栏目Id
     */
    public Integer getCateId() {
        return cateId;
    }

    /**
     * 设置栏目Id
     *
     * @param cateId 栏目Id
     */
    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return create_username
     */
    public String getCreateUsername() {
        return createUsername;
    }

    /**
     * @param createUsername
     */
    public void setCreateUsername(String createUsername) {
        this.createUsername = createUsername;
    }

    /**
     * 获取创建人id
     *
     * @return create_user_id - 创建人id
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置创建人id
     *
     * @param createUserId 创建人id
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取发布时间
     *
     * @return publish_time - 发布时间
     */
    public Date getPublishTime() {
        return publishTime;
    }

    /**
     * 设置发布时间
     *
     * @param publishTime 发布时间
     */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    /**
     * @return publish_username
     */
    public String getPublishUsername() {
        return publishUsername;
    }

    /**
     * @param publishUsername
     */
    public void setPublishUsername(String publishUsername) {
        this.publishUsername = publishUsername;
    }

    /**
     * 获取发布人id
     *
     * @return publish_user_id - 发布人id
     */
    public String getPublishUserId() {
        return publishUserId;
    }

    /**
     * 设置发布人id
     *
     * @param publishUserId 发布人id
     */
    public void setPublishUserId(String publishUserId) {
        this.publishUserId = publishUserId;
    }

    /**
     * 获取是否置顶
     *
     * @return art_top - 是否置顶
     */
    public Integer getArtTop() {
        return artTop;
    }

    /**
     * 设置是否置顶
     *
     * @param artTop 是否置顶
     */
    public void setArtTop(Integer artTop) {
        this.artTop = artTop;
    }

    /**
     * 获取状态
     *
     * @return art_state - 状态
     */
    public Integer getArtState() {
        return artState;
    }

    /**
     * 设置状态
     *
     * @param artState 状态
     */
    public void setArtState(Integer artState) {
        this.artState = artState;
    }

    /**
     * 获取显示开始时间
     *
     * @return show_start_time - 显示开始时间
     */
    public Date getShowStartTime() {
        return showStartTime;
    }

    /**
     * 设置显示开始时间
     *
     * @param showStartTime 显示开始时间
     */
    public void setShowStartTime(Date showStartTime) {
        this.showStartTime = showStartTime;
    }

    /**
     * 获取显示结束时间
     *
     * @return show_end_time - 显示结束时间
     */
    public Date getShowEndTime() {
        return showEndTime;
    }

    /**
     * 设置显示结束时间
     *
     * @param showEndTime 显示结束时间
     */
    public void setShowEndTime(Date showEndTime) {
        this.showEndTime = showEndTime;
    }

    /**
     * 获取开启评论
     *
     * @return open_commen - 开启评论
     */
    public Integer getOpenCommen() {
        return openCommen;
    }

    /**
     * 设置开启评论
     *
     * @param openCommen 开启评论
     */
    public void setOpenCommen(Integer openCommen) {
        this.openCommen = openCommen;
    }

    /**
     * 获取栏目id
     *
     * @return colu_id - 栏目id
     */
    public Integer getColuId() {
        return coluId;
    }

    /**
     * 设置栏目id
     *
     * @param coluId 栏目id
     */
    public void setColuId(Integer coluId) {
        this.coluId = coluId;
    }

    /**
     * 获取栏目名称
     *
     * @return colu_name - 栏目名称
     */
    public String getColuName() {
        return coluName;
    }

    /**
     * 设置栏目名称
     *
     * @param coluName 栏目名称
     */
    public void setColuName(String coluName) {
        this.coluName = coluName;
    }

    /**
     * @return create_group_id
     */
    public Integer getCreateGroupId() {
        return createGroupId;
    }

    /**
     * @param createGroupId
     */
    public void setCreateGroupId(Integer createGroupId) {
        this.createGroupId = createGroupId;
    }

    /**
     * @return create_group_name
     */
    public String getCreateGroupName() {
        return createGroupName;
    }

    /**
     * @param createGroupName
     */
    public void setCreateGroupName(String createGroupName) {
        this.createGroupName = createGroupName;
    }

    /**
     * 获取内容
     *
     * @return art_content - 内容
     */
    public String getArtContent() {
        return artContent;
    }

    /**
     * 设置内容
     *
     * @param artContent 内容
     */
    public void setArtContent(String artContent) {
        this.artContent = artContent;
    }
}