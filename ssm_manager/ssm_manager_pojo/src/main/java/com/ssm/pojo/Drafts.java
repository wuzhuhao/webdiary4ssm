package com.ssm.pojo;

import java.io.Serializable;
import java.util.List;

public class Drafts implements Serializable {
    /**
     * 
     * 表字段 : ddiary.Did
     */
    private Integer did;

    /**
     * 
     * 表字段 : ddiary.title
     */
    private String title;

    /**
     * 
     * 表字段 : ddiary.classify
     */
    private String classify;

    /**
     * 
     * 表字段 : ddiary.dTime
     */
    private String dtime;

    /**
     * 
     * 表字段 : ddiary.image
     */
    private String image;

    /**
     * 
     * 表字段 : ddiary.Uid
     */
    private Integer uid;

    /**
     * 
     * 表字段 : ddiary.province
     */
    private String province;

    /**
     * 
     * 表字段 : ddiary.city
     */
    private String city;

    /**
     * 
     * 表字段 : ddiary.countryRegion
     */
    private String countryregion;

    /**
     * 
     * 表字段 : ddiary.monthTime
     */
    private Integer monthtime;

    /**
     * 
     * 表字段 : ddiary.totalTime
     */
    private Integer totaltime;

    /**
     * 
     * 表字段 : ddiary.keyLandscape
     */
    private String keylandscape;

    /**
     * 
     * 表字段 : ddiary.content
     */
    private String content;

    /**
     * 
     * 表字段 : ddiary.content2
     */
    private String content2;

    private User user;

    private List<DraftsPhoto> draftsPhotos;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ddiary
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:ddiary.Did
     *
     * @return ddiary.Did, 
     */
    public Integer getDid() {
        return did;
    }

    /**
     * 设置  字段:ddiary.Did
     *
     * @param did the value for ddiary.Did, 
     */
    public void setDid(Integer did) {
        this.did = did;
    }

    /**
     * 获取  字段:ddiary.title
     *
     * @return ddiary.title, 
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置  字段:ddiary.title
     *
     * @param title the value for ddiary.title, 
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取  字段:ddiary.classify
     *
     * @return ddiary.classify, 
     */
    public String getClassify() {
        return classify;
    }

    /**
     * 设置  字段:ddiary.classify
     *
     * @param classify the value for ddiary.classify, 
     */
    public void setClassify(String classify) {
        this.classify = classify == null ? null : classify.trim();
    }

    /**
     * 获取  字段:ddiary.dTime
     *
     * @return ddiary.dTime, 
     */
    public String getDtime() {
        return dtime;
    }

    /**
     * 设置  字段:ddiary.dTime
     *
     * @param dtime the value for ddiary.dTime, 
     */
    public void setDtime(String dtime) {
        this.dtime = dtime == null ? null : dtime.trim();
    }

    /**
     * 获取  字段:ddiary.image
     *
     * @return ddiary.image, 
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置  字段:ddiary.image
     *
     * @param image the value for ddiary.image, 
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * 获取  字段:ddiary.Uid
     *
     * @return ddiary.Uid, 
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置  字段:ddiary.Uid
     *
     * @param uid the value for ddiary.Uid, 
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取  字段:ddiary.province
     *
     * @return ddiary.province, 
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置  字段:ddiary.province
     *
     * @param province the value for ddiary.province, 
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 获取  字段:ddiary.city
     *
     * @return ddiary.city, 
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置  字段:ddiary.city
     *
     * @param city the value for ddiary.city, 
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 获取  字段:ddiary.countryRegion
     *
     * @return ddiary.countryRegion, 
     */
    public String getCountryregion() {
        return countryregion;
    }

    /**
     * 设置  字段:ddiary.countryRegion
     *
     * @param countryregion the value for ddiary.countryRegion, 
     */
    public void setCountryregion(String countryregion) {
        this.countryregion = countryregion == null ? null : countryregion.trim();
    }

    /**
     * 获取  字段:ddiary.monthTime
     *
     * @return ddiary.monthTime, 
     */
    public Integer getMonthtime() {
        return monthtime;
    }

    /**
     * 设置  字段:ddiary.monthTime
     *
     * @param monthtime the value for ddiary.monthTime, 
     */
    public void setMonthtime(Integer monthtime) {
        this.monthtime = monthtime;
    }

    /**
     * 获取  字段:ddiary.totalTime
     *
     * @return ddiary.totalTime, 
     */
    public Integer getTotaltime() {
        return totaltime;
    }

    /**
     * 设置  字段:ddiary.totalTime
     *
     * @param totaltime the value for ddiary.totalTime, 
     */
    public void setTotaltime(Integer totaltime) {
        this.totaltime = totaltime;
    }

    /**
     * 获取  字段:ddiary.keyLandscape
     *
     * @return ddiary.keyLandscape, 
     */
    public String getKeylandscape() {
        return keylandscape;
    }

    /**
     * 设置  字段:ddiary.keyLandscape
     *
     * @param keylandscape the value for ddiary.keyLandscape, 
     */
    public void setKeylandscape(String keylandscape) {
        this.keylandscape = keylandscape == null ? null : keylandscape.trim();
    }

    /**
     * 获取  字段:ddiary.content
     *
     * @return ddiary.content, 
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置  字段:ddiary.content
     *
     * @param content the value for ddiary.content, 
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 获取  字段:ddiary.content2
     *
     * @return ddiary.content2, 
     */
    public String getContent2() {
        return content2;
    }

    /**
     * 设置  字段:ddiary.content2
     *
     * @param content2 the value for ddiary.content2, 
     */
    public void setContent2(String content2) {
        this.content2 = content2 == null ? null : content2.trim();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user=user;
    }

    public List<DraftsPhoto> getDraftsPhotos() {
        return draftsPhotos;
    }

    public void setDraftsPhotos(List<DraftsPhoto> draftsPhotos) {
        this.draftsPhotos=draftsPhotos;
    }
}