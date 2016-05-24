package com.lilkr.model;

import java.math.BigDecimal;

public class Store {
    private Integer storeId;

    private String storeName;

    private Integer gradeId;

    private Integer memberId;

    private String memberName;

    private String sellerName;

    private Integer scId;

    private String storeCompanyName;

    private Integer provinceId;

    private String areaInfo;

    private String storeAddress;

    private String storeZip;

    private Boolean storeState;

    private String storeCloseInfo;

    private Integer storeSort;

    private String storeTime;

    private String storeEndTime;

    private String storeLabel;

    private String storeBanner;

    private String storeAvatar;

    private String storeKeywords;

    private String storeDescription;

    private String storeQq;

    private String storeWw;

    private String storePhone;

    private String storeDomain;

    private Boolean storeDomainTimes;

    private Boolean storeRecommend;

    private String storeTheme;

    private Integer storeCredit;

    private Float storeDesccredit;

    private Float storeServicecredit;

    private Float storeDeliverycredit;

    private Integer storeCollect;

    private String storeStamp;

    private String storePrintdesc;

    private Integer storeSales;

    private String storeWorkingtime;

    private BigDecimal storeFreePrice;

    private Integer storeDecorationSwitch;

    private Boolean storeDecorationOnly;

    private Integer storeDecorationImageCount;

    private String liveStoreName;

    private String liveStoreAddress;

    private String liveStoreTel;

    private String liveStoreBus;

    private Byte isOwnShop;

    private Byte bindAllGc;

    private String storeVrcodePrefix;

    private Boolean storeBaozh;

    private Boolean storeBaozhopen;

    private String storeBaozhrmb;

    private Boolean storeQtian;

    private Boolean storeZhping;

    private Boolean storeErxiaoshi;

    private Boolean storeTuihuo;

    private Boolean storeShiyong;

    private Boolean storeShiti;

    private Boolean storeXiaoxie;

    private Boolean storeHuodaofk;

    public Store(Integer storeId, String storeName, Integer gradeId, Integer memberId, String memberName, String sellerName, Integer scId, String storeCompanyName, Integer provinceId, String areaInfo, String storeAddress, String storeZip, Boolean storeState, String storeCloseInfo, Integer storeSort, String storeTime, String storeEndTime, String storeLabel, String storeBanner, String storeAvatar, String storeKeywords, String storeDescription, String storeQq, String storeWw, String storePhone, String storeDomain, Boolean storeDomainTimes, Boolean storeRecommend, String storeTheme, Integer storeCredit, Float storeDesccredit, Float storeServicecredit, Float storeDeliverycredit, Integer storeCollect, String storeStamp, String storePrintdesc, Integer storeSales, String storeWorkingtime, BigDecimal storeFreePrice, Integer storeDecorationSwitch, Boolean storeDecorationOnly, Integer storeDecorationImageCount, String liveStoreName, String liveStoreAddress, String liveStoreTel, String liveStoreBus, Byte isOwnShop, Byte bindAllGc, String storeVrcodePrefix, Boolean storeBaozh, Boolean storeBaozhopen, String storeBaozhrmb, Boolean storeQtian, Boolean storeZhping, Boolean storeErxiaoshi, Boolean storeTuihuo, Boolean storeShiyong, Boolean storeShiti, Boolean storeXiaoxie, Boolean storeHuodaofk) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.gradeId = gradeId;
        this.memberId = memberId;
        this.memberName = memberName;
        this.sellerName = sellerName;
        this.scId = scId;
        this.storeCompanyName = storeCompanyName;
        this.provinceId = provinceId;
        this.areaInfo = areaInfo;
        this.storeAddress = storeAddress;
        this.storeZip = storeZip;
        this.storeState = storeState;
        this.storeCloseInfo = storeCloseInfo;
        this.storeSort = storeSort;
        this.storeTime = storeTime;
        this.storeEndTime = storeEndTime;
        this.storeLabel = storeLabel;
        this.storeBanner = storeBanner;
        this.storeAvatar = storeAvatar;
        this.storeKeywords = storeKeywords;
        this.storeDescription = storeDescription;
        this.storeQq = storeQq;
        this.storeWw = storeWw;
        this.storePhone = storePhone;
        this.storeDomain = storeDomain;
        this.storeDomainTimes = storeDomainTimes;
        this.storeRecommend = storeRecommend;
        this.storeTheme = storeTheme;
        this.storeCredit = storeCredit;
        this.storeDesccredit = storeDesccredit;
        this.storeServicecredit = storeServicecredit;
        this.storeDeliverycredit = storeDeliverycredit;
        this.storeCollect = storeCollect;
        this.storeStamp = storeStamp;
        this.storePrintdesc = storePrintdesc;
        this.storeSales = storeSales;
        this.storeWorkingtime = storeWorkingtime;
        this.storeFreePrice = storeFreePrice;
        this.storeDecorationSwitch = storeDecorationSwitch;
        this.storeDecorationOnly = storeDecorationOnly;
        this.storeDecorationImageCount = storeDecorationImageCount;
        this.liveStoreName = liveStoreName;
        this.liveStoreAddress = liveStoreAddress;
        this.liveStoreTel = liveStoreTel;
        this.liveStoreBus = liveStoreBus;
        this.isOwnShop = isOwnShop;
        this.bindAllGc = bindAllGc;
        this.storeVrcodePrefix = storeVrcodePrefix;
        this.storeBaozh = storeBaozh;
        this.storeBaozhopen = storeBaozhopen;
        this.storeBaozhrmb = storeBaozhrmb;
        this.storeQtian = storeQtian;
        this.storeZhping = storeZhping;
        this.storeErxiaoshi = storeErxiaoshi;
        this.storeTuihuo = storeTuihuo;
        this.storeShiyong = storeShiyong;
        this.storeShiti = storeShiti;
        this.storeXiaoxie = storeXiaoxie;
        this.storeHuodaofk = storeHuodaofk;
    }

    public Store() {
        super();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
    }

    public String getStoreCompanyName() {
        return storeCompanyName;
    }

    public void setStoreCompanyName(String storeCompanyName) {
        this.storeCompanyName = storeCompanyName == null ? null : storeCompanyName.trim();
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getAreaInfo() {
        return areaInfo;
    }

    public void setAreaInfo(String areaInfo) {
        this.areaInfo = areaInfo == null ? null : areaInfo.trim();
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress == null ? null : storeAddress.trim();
    }

    public String getStoreZip() {
        return storeZip;
    }

    public void setStoreZip(String storeZip) {
        this.storeZip = storeZip == null ? null : storeZip.trim();
    }

    public Boolean getStoreState() {
        return storeState;
    }

    public void setStoreState(Boolean storeState) {
        this.storeState = storeState;
    }

    public String getStoreCloseInfo() {
        return storeCloseInfo;
    }

    public void setStoreCloseInfo(String storeCloseInfo) {
        this.storeCloseInfo = storeCloseInfo == null ? null : storeCloseInfo.trim();
    }

    public Integer getStoreSort() {
        return storeSort;
    }

    public void setStoreSort(Integer storeSort) {
        this.storeSort = storeSort;
    }

    public String getStoreTime() {
        return storeTime;
    }

    public void setStoreTime(String storeTime) {
        this.storeTime = storeTime == null ? null : storeTime.trim();
    }

    public String getStoreEndTime() {
        return storeEndTime;
    }

    public void setStoreEndTime(String storeEndTime) {
        this.storeEndTime = storeEndTime == null ? null : storeEndTime.trim();
    }

    public String getStoreLabel() {
        return storeLabel;
    }

    public void setStoreLabel(String storeLabel) {
        this.storeLabel = storeLabel == null ? null : storeLabel.trim();
    }

    public String getStoreBanner() {
        return storeBanner;
    }

    public void setStoreBanner(String storeBanner) {
        this.storeBanner = storeBanner == null ? null : storeBanner.trim();
    }

    public String getStoreAvatar() {
        return storeAvatar;
    }

    public void setStoreAvatar(String storeAvatar) {
        this.storeAvatar = storeAvatar == null ? null : storeAvatar.trim();
    }

    public String getStoreKeywords() {
        return storeKeywords;
    }

    public void setStoreKeywords(String storeKeywords) {
        this.storeKeywords = storeKeywords == null ? null : storeKeywords.trim();
    }

    public String getStoreDescription() {
        return storeDescription;
    }

    public void setStoreDescription(String storeDescription) {
        this.storeDescription = storeDescription == null ? null : storeDescription.trim();
    }

    public String getStoreQq() {
        return storeQq;
    }

    public void setStoreQq(String storeQq) {
        this.storeQq = storeQq == null ? null : storeQq.trim();
    }

    public String getStoreWw() {
        return storeWw;
    }

    public void setStoreWw(String storeWw) {
        this.storeWw = storeWw == null ? null : storeWw.trim();
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone == null ? null : storePhone.trim();
    }

    public String getStoreDomain() {
        return storeDomain;
    }

    public void setStoreDomain(String storeDomain) {
        this.storeDomain = storeDomain == null ? null : storeDomain.trim();
    }

    public Boolean getStoreDomainTimes() {
        return storeDomainTimes;
    }

    public void setStoreDomainTimes(Boolean storeDomainTimes) {
        this.storeDomainTimes = storeDomainTimes;
    }

    public Boolean getStoreRecommend() {
        return storeRecommend;
    }

    public void setStoreRecommend(Boolean storeRecommend) {
        this.storeRecommend = storeRecommend;
    }

    public String getStoreTheme() {
        return storeTheme;
    }

    public void setStoreTheme(String storeTheme) {
        this.storeTheme = storeTheme == null ? null : storeTheme.trim();
    }

    public Integer getStoreCredit() {
        return storeCredit;
    }

    public void setStoreCredit(Integer storeCredit) {
        this.storeCredit = storeCredit;
    }

    public Float getStoreDesccredit() {
        return storeDesccredit;
    }

    public void setStoreDesccredit(Float storeDesccredit) {
        this.storeDesccredit = storeDesccredit;
    }

    public Float getStoreServicecredit() {
        return storeServicecredit;
    }

    public void setStoreServicecredit(Float storeServicecredit) {
        this.storeServicecredit = storeServicecredit;
    }

    public Float getStoreDeliverycredit() {
        return storeDeliverycredit;
    }

    public void setStoreDeliverycredit(Float storeDeliverycredit) {
        this.storeDeliverycredit = storeDeliverycredit;
    }

    public Integer getStoreCollect() {
        return storeCollect;
    }

    public void setStoreCollect(Integer storeCollect) {
        this.storeCollect = storeCollect;
    }

    public String getStoreStamp() {
        return storeStamp;
    }

    public void setStoreStamp(String storeStamp) {
        this.storeStamp = storeStamp == null ? null : storeStamp.trim();
    }

    public String getStorePrintdesc() {
        return storePrintdesc;
    }

    public void setStorePrintdesc(String storePrintdesc) {
        this.storePrintdesc = storePrintdesc == null ? null : storePrintdesc.trim();
    }

    public Integer getStoreSales() {
        return storeSales;
    }

    public void setStoreSales(Integer storeSales) {
        this.storeSales = storeSales;
    }

    public String getStoreWorkingtime() {
        return storeWorkingtime;
    }

    public void setStoreWorkingtime(String storeWorkingtime) {
        this.storeWorkingtime = storeWorkingtime == null ? null : storeWorkingtime.trim();
    }

    public BigDecimal getStoreFreePrice() {
        return storeFreePrice;
    }

    public void setStoreFreePrice(BigDecimal storeFreePrice) {
        this.storeFreePrice = storeFreePrice;
    }

    public Integer getStoreDecorationSwitch() {
        return storeDecorationSwitch;
    }

    public void setStoreDecorationSwitch(Integer storeDecorationSwitch) {
        this.storeDecorationSwitch = storeDecorationSwitch;
    }

    public Boolean getStoreDecorationOnly() {
        return storeDecorationOnly;
    }

    public void setStoreDecorationOnly(Boolean storeDecorationOnly) {
        this.storeDecorationOnly = storeDecorationOnly;
    }

    public Integer getStoreDecorationImageCount() {
        return storeDecorationImageCount;
    }

    public void setStoreDecorationImageCount(Integer storeDecorationImageCount) {
        this.storeDecorationImageCount = storeDecorationImageCount;
    }

    public String getLiveStoreName() {
        return liveStoreName;
    }

    public void setLiveStoreName(String liveStoreName) {
        this.liveStoreName = liveStoreName == null ? null : liveStoreName.trim();
    }

    public String getLiveStoreAddress() {
        return liveStoreAddress;
    }

    public void setLiveStoreAddress(String liveStoreAddress) {
        this.liveStoreAddress = liveStoreAddress == null ? null : liveStoreAddress.trim();
    }

    public String getLiveStoreTel() {
        return liveStoreTel;
    }

    public void setLiveStoreTel(String liveStoreTel) {
        this.liveStoreTel = liveStoreTel == null ? null : liveStoreTel.trim();
    }

    public String getLiveStoreBus() {
        return liveStoreBus;
    }

    public void setLiveStoreBus(String liveStoreBus) {
        this.liveStoreBus = liveStoreBus == null ? null : liveStoreBus.trim();
    }

    public Byte getIsOwnShop() {
        return isOwnShop;
    }

    public void setIsOwnShop(Byte isOwnShop) {
        this.isOwnShop = isOwnShop;
    }

    public Byte getBindAllGc() {
        return bindAllGc;
    }

    public void setBindAllGc(Byte bindAllGc) {
        this.bindAllGc = bindAllGc;
    }

    public String getStoreVrcodePrefix() {
        return storeVrcodePrefix;
    }

    public void setStoreVrcodePrefix(String storeVrcodePrefix) {
        this.storeVrcodePrefix = storeVrcodePrefix == null ? null : storeVrcodePrefix.trim();
    }

    public Boolean getStoreBaozh() {
        return storeBaozh;
    }

    public void setStoreBaozh(Boolean storeBaozh) {
        this.storeBaozh = storeBaozh;
    }

    public Boolean getStoreBaozhopen() {
        return storeBaozhopen;
    }

    public void setStoreBaozhopen(Boolean storeBaozhopen) {
        this.storeBaozhopen = storeBaozhopen;
    }

    public String getStoreBaozhrmb() {
        return storeBaozhrmb;
    }

    public void setStoreBaozhrmb(String storeBaozhrmb) {
        this.storeBaozhrmb = storeBaozhrmb == null ? null : storeBaozhrmb.trim();
    }

    public Boolean getStoreQtian() {
        return storeQtian;
    }

    public void setStoreQtian(Boolean storeQtian) {
        this.storeQtian = storeQtian;
    }

    public Boolean getStoreZhping() {
        return storeZhping;
    }

    public void setStoreZhping(Boolean storeZhping) {
        this.storeZhping = storeZhping;
    }

    public Boolean getStoreErxiaoshi() {
        return storeErxiaoshi;
    }

    public void setStoreErxiaoshi(Boolean storeErxiaoshi) {
        this.storeErxiaoshi = storeErxiaoshi;
    }

    public Boolean getStoreTuihuo() {
        return storeTuihuo;
    }

    public void setStoreTuihuo(Boolean storeTuihuo) {
        this.storeTuihuo = storeTuihuo;
    }

    public Boolean getStoreShiyong() {
        return storeShiyong;
    }

    public void setStoreShiyong(Boolean storeShiyong) {
        this.storeShiyong = storeShiyong;
    }

    public Boolean getStoreShiti() {
        return storeShiti;
    }

    public void setStoreShiti(Boolean storeShiti) {
        this.storeShiti = storeShiti;
    }

    public Boolean getStoreXiaoxie() {
        return storeXiaoxie;
    }

    public void setStoreXiaoxie(Boolean storeXiaoxie) {
        this.storeXiaoxie = storeXiaoxie;
    }

    public Boolean getStoreHuodaofk() {
        return storeHuodaofk;
    }

    public void setStoreHuodaofk(Boolean storeHuodaofk) {
        this.storeHuodaofk = storeHuodaofk;
    }
}