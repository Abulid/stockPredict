package com.qqt.stockpredict.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

/**
 * 股市新闻
 * @TableName stocknews
 */
@TableName(value ="stocknews")
@Data
public class Stocknews implements Serializable {
    /**
     * 文章id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 文章标题
     */
    @TableField(value = "tittle")
    private String tittle;

    /**
     * 
     */
    @TableField(value = "time")
    private String time;

    /**
     * 来源
     */
    @TableField(value = "source")
    private String source;

    /**
     * 分类
     */
    @TableField(value = "category")
    private String category;

    /**
     * 图片路径
     */
    @TableField(value = "picture")
    private String picture;

    /**
     * 手机url
     */
    @TableField(value = "phoneUrl")
    private String phoneUrl;

    /**
     * 电脑url
     */
    @TableField(value = "webUrl")
    private String webUrl;

    /**
     * 文章内容
     */
    @TableField(value = "content")
    private String content;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Stocknews other = (Stocknews) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTittle() == null ? other.getTittle() == null : this.getTittle().equals(other.getTittle()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getPicture() == null ? other.getPicture() == null : this.getPicture().equals(other.getPicture()))
            && (this.getPhoneUrl() == null ? other.getPhoneUrl() == null : this.getPhoneUrl().equals(other.getPhoneUrl()))
            && (this.getWebUrl() == null ? other.getWebUrl() == null : this.getWebUrl().equals(other.getWebUrl()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTittle() == null) ? 0 : getTittle().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getPicture() == null) ? 0 : getPicture().hashCode());
        result = prime * result + ((getPhoneUrl() == null) ? 0 : getPhoneUrl().hashCode());
        result = prime * result + ((getWebUrl() == null) ? 0 : getWebUrl().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tittle=").append(tittle);
        sb.append(", time=").append(time);
        sb.append(", source=").append(source);
        sb.append(", category=").append(category);
        sb.append(", picture=").append(picture);
        sb.append(", phoneUrl=").append(phoneUrl);
        sb.append(", webUrl=").append(webUrl);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}