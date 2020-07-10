package com.yangq.selfmotivation.dao.po;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import io.ebean.Model;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

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
//

    @OneToMany(mappedBy = "cmsColumn", fetch = FetchType.LAZY)
    @JsonIgnoreProperties("cmsColumn")
    private List<CmsArticle> articleList;
}