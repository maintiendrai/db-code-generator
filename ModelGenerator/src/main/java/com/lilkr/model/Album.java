package com.lilkr.model;

public class Album {
    private Integer aclassId;

    private String aclassName;

    private Integer storeId;

    private String aclassDes;

    private Byte aclassSort;

    private String aclassCover;

    private Integer uploadTime;

    private Boolean isDefault;

    public Album(Integer aclassId, String aclassName, Integer storeId, String aclassDes, Byte aclassSort, String aclassCover, Integer uploadTime, Boolean isDefault) {
        this.aclassId = aclassId;
        this.aclassName = aclassName;
        this.storeId = storeId;
        this.aclassDes = aclassDes;
        this.aclassSort = aclassSort;
        this.aclassCover = aclassCover;
        this.uploadTime = uploadTime;
        this.isDefault = isDefault;
    }

    public Album() {
        super();
    }

    public Integer getAclassId() {
        return aclassId;
    }

    public void setAclassId(Integer aclassId) {
        this.aclassId = aclassId;
    }

    public String getAclassName() {
        return aclassName;
    }

    public void setAclassName(String aclassName) {
        this.aclassName = aclassName == null ? null : aclassName.trim();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getAclassDes() {
        return aclassDes;
    }

    public void setAclassDes(String aclassDes) {
        this.aclassDes = aclassDes == null ? null : aclassDes.trim();
    }

    public Byte getAclassSort() {
        return aclassSort;
    }

    public void setAclassSort(Byte aclassSort) {
        this.aclassSort = aclassSort;
    }

    public String getAclassCover() {
        return aclassCover;
    }

    public void setAclassCover(String aclassCover) {
        this.aclassCover = aclassCover == null ? null : aclassCover.trim();
    }

    public Integer getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Integer uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }
}