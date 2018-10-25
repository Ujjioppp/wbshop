package com.wb.shop.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Commodity {
    
    private Long id;

    
    private String uuid;

    
    private String name;

    
    private String title;

    
    private BigDecimal price;

    
    private String img;

    
    private Long creator;

    
    private Date createTime;

    
    private Long updater;

    
    private Date updateTime;

    
    private Integer deleted;

    
    private String description;

    
    public Long getId() {
        return id;
    }

    
    public void setId(Long id) {
        this.id = id;
    }

    
    public String getUuid() {
        return uuid;
    }

    
    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    
    public String getTitle() {
        return title;
    }

    
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    
    public BigDecimal getPrice() {
        return price;
    }

    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    
    public String getImg() {
        return img;
    }

    
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    
    public Long getCreator() {
        return creator;
    }

    
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    
    public Date getCreateTime() {
        return createTime;
    }

    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    
    public Long getUpdater() {
        return updater;
    }

    
    public void setUpdater(Long updater) {
        this.updater = updater;
    }

    
    public Date getUpdateTime() {
        return updateTime;
    }

    
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    
    public Integer getDeleted() {
        return deleted;
    }

    
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    
    public String getDescription() {
        return description;
    }

    
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}