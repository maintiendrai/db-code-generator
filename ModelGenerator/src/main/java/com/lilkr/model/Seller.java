package com.lilkr.model;

public class Seller {
    private Integer sellerId;

    private String sellerName;

    private Integer memberId;

    private Integer sellerGroupId;

    private Integer storeId;

    private Byte isAdmin;

    private String sellerQuicklink;

    private Integer lastLoginTime;

    public Seller(Integer sellerId, String sellerName, Integer memberId, Integer sellerGroupId, Integer storeId, Byte isAdmin, String sellerQuicklink, Integer lastLoginTime) {
        this.sellerId = sellerId;
        this.sellerName = sellerName;
        this.memberId = memberId;
        this.sellerGroupId = sellerGroupId;
        this.storeId = storeId;
        this.isAdmin = isAdmin;
        this.sellerQuicklink = sellerQuicklink;
        this.lastLoginTime = lastLoginTime;
    }

    public Seller() {
        super();
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getSellerGroupId() {
        return sellerGroupId;
    }

    public void setSellerGroupId(Integer sellerGroupId) {
        this.sellerGroupId = sellerGroupId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Byte getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Byte isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getSellerQuicklink() {
        return sellerQuicklink;
    }

    public void setSellerQuicklink(String sellerQuicklink) {
        this.sellerQuicklink = sellerQuicklink == null ? null : sellerQuicklink.trim();
    }

    public Integer getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Integer lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}