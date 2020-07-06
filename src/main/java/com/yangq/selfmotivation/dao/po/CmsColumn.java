package com.yangq.selfmotivation.dao.po;

import io.ebean.Model;
import lombok.Data;

import javax.persistence.*;

@Table(name = "`cms_column`")
@Data
@Entity
public class CmsColumn extends Model {

    @Id
    Long id;

    /**
     * 栏目名称
     */
    @Column(name = "`colu_name`")
    private String coluName;

    /**
     * 栏目描述
     */
    @Column(name = "`colu_des`")
    private String coluDes;

    /**
     * 网站id
     */
    @Column(name = "`web_id`")
    private Integer webId;

    /**
     * 父级id
     */
    @Column(name = "`parent_id`")
    private Integer parentId;

    /**
     * 状态
     */
    @Column(name = "`state`")
    private Integer state;

    /**
     * 开启评论
     */
    @Column(name = "`open_comment`")
    private Integer openComment;

    /**
     * 栏目位置
     */
    @Column(name = "`position`")
    private String position;

    /**
     * 栏目类型 1：顶部 2：专题专栏 3：灵活栏目
     */
    @Column(name = "`colu_type`")
    private String coluType;

    /**
     * 等级
     */
    @Column(name = "`colu_level`")
    private Integer coluLevel;

    /**
     * 栏目图片地址
     */
    @Column(name = "`colu_img_path`")
    private String coluImgPath;

    /**
     * 栏目图片名称
     */
    @Column(name = "`colu_img_name`")
    private String coluImgName;

    /**
     * 默认栏目
     */
    @Column(name = "`colu_default`")
    private Integer coluDefault;

    /**
     * 接收共享
     */
    @Column(name = "`share_in`")
    private Integer shareIn;

    /**
     * 对外共享
     */
    @Column(name = "`share_out`")
    private Integer shareOut;

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
     * 获取栏目描述
     *
     * @return colu_des - 栏目描述
     */
    public String getColuDes() {
        return coluDes;
    }

    /**
     * 设置栏目描述
     *
     * @param coluDes 栏目描述
     */
    public void setColuDes(String coluDes) {
        this.coluDes = coluDes;
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
     * 获取父级id
     *
     * @return parent_id - 父级id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置父级id
     *
     * @param parentId 父级id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取状态
     *
     * @return state - 状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置状态
     *
     * @param state 状态
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取开启评论
     *
     * @return open_comment - 开启评论
     */
    public Integer getOpenComment() {
        return openComment;
    }

    /**
     * 设置开启评论
     *
     * @param openComment 开启评论
     */
    public void setOpenComment(Integer openComment) {
        this.openComment = openComment;
    }

    /**
     * 获取栏目位置
     *
     * @return position - 栏目位置
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置栏目位置
     *
     * @param position 栏目位置
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取栏目类型 1：顶部 2：专题专栏 3：灵活栏目
     *
     * @return colu_type - 栏目类型 1：顶部 2：专题专栏 3：灵活栏目
     */
    public String getColuType() {
        return coluType;
    }

    /**
     * 设置栏目类型 1：顶部 2：专题专栏 3：灵活栏目
     *
     * @param coluType 栏目类型 1：顶部 2：专题专栏 3：灵活栏目
     */
    public void setColuType(String coluType) {
        this.coluType = coluType;
    }

    /**
     * 获取等级
     *
     * @return colu_level - 等级
     */
    public Integer getColuLevel() {
        return coluLevel;
    }

    /**
     * 设置等级
     *
     * @param coluLevel 等级
     */
    public void setColuLevel(Integer coluLevel) {
        this.coluLevel = coluLevel;
    }

    /**
     * 获取栏目图片地址
     *
     * @return colu_img_path - 栏目图片地址
     */
    public String getColuImgPath() {
        return coluImgPath;
    }

    /**
     * 设置栏目图片地址
     *
     * @param coluImgPath 栏目图片地址
     */
    public void setColuImgPath(String coluImgPath) {
        this.coluImgPath = coluImgPath;
    }

    /**
     * 获取栏目图片名称
     *
     * @return colu_img_name - 栏目图片名称
     */
    public String getColuImgName() {
        return coluImgName;
    }

    /**
     * 设置栏目图片名称
     *
     * @param coluImgName 栏目图片名称
     */
    public void setColuImgName(String coluImgName) {
        this.coluImgName = coluImgName;
    }

    /**
     * 获取默认栏目
     *
     * @return colu_default - 默认栏目
     */
    public Integer getColuDefault() {
        return coluDefault;
    }

    /**
     * 设置默认栏目
     *
     * @param coluDefault 默认栏目
     */
    public void setColuDefault(Integer coluDefault) {
        this.coluDefault = coluDefault;
    }

    /**
     * 获取接收共享
     *
     * @return share_in - 接收共享
     */
    public Integer getShareIn() {
        return shareIn;
    }

    /**
     * 设置接收共享
     *
     * @param shareIn 接收共享
     */
    public void setShareIn(Integer shareIn) {
        this.shareIn = shareIn;
    }

    /**
     * 获取对外共享
     *
     * @return share_out - 对外共享
     */
    public Integer getShareOut() {
        return shareOut;
    }

    /**
     * 设置对外共享
     *
     * @param shareOut 对外共享
     */
    public void setShareOut(Integer shareOut) {
        this.shareOut = shareOut;
    }
}