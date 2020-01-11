package com.ssm.pojo;

import java.io.Serializable;

public class DiaryPhoto implements Serializable {
    /**
     * 
     * 表字段 : diaryphoto.id
     */
    private Integer id;

    /**
     * 
     * 表字段 : diaryphoto.images
     */
    private String images;

    /**
     * 
     * 表字段 : diaryphoto.did
     */
    private Integer did;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table diaryphoto
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:diaryphoto.id
     *
     * @return diaryphoto.id, 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:diaryphoto.id
     *
     * @param id the value for diaryphoto.id, 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取  字段:diaryphoto.images
     *
     * @return diaryphoto.images, 
     */
    public String getImages() {
        return images;
    }

    /**
     * 设置  字段:diaryphoto.images
     *
     * @param images the value for diaryphoto.images, 
     */
    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    /**
     * 获取  字段:diaryphoto.did
     *
     * @return diaryphoto.did, 
     */
    public Integer getDid() {
        return did;
    }

    /**
     * 设置  字段:diaryphoto.did
     *
     * @param did the value for diaryphoto.did, 
     */
    public void setDid(Integer did) {
        this.did = did;
    }
}