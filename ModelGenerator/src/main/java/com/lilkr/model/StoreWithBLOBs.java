package com.lilkr.model;

public class StoreWithBLOBs extends Store {
    private String storeZy;

    private String storeSlide;

    private String storeSlideUrl;

    private String storePresales;

    private String storeAftersales;

    public StoreWithBLOBs(Integer storeId, String storeName, Integer gradeId, Integer memberId, String memberName, String sellerName, Integer scId, String storeCompanyName, Integer provinceId, String areaInfo, String storeAddress, String storeZip, Boolean storeState, String storeCloseInfo, Integer storeSort, String storeTime, String storeEndTime, String storeLabel, String storeBanner, String storeAvatar, String storeKeywords, String storeDescription, String storeQq, String storeWw, String storePhone, String storeDomain, Boolean storeDomainTimes, Boolean storeRecommend, String storeTheme, Integer storeCredit, Float storeDesccredit, Float storeServicecredit, Float storeDeliverycredit, Integer storeCollect, String storeStamp, String storePrintdesc, Integer storeSales, String storeWorkingtime, BigDecimal storeFreePrice, Integer storeDecorationSwitch, Boolean storeDecorationOnly, Integer storeDecorationImageCount, String liveStoreName, String liveStoreAddress, String liveStoreTel, String liveStoreBus, Byte isOwnShop, Byte bindAllGc, String storeVrcodePrefix, Boolean storeBaozh, Boolean storeBaozhopen, String storeBaozhrmb, Boolean storeQtian, Boolean storeZhping, Boolean storeErxiaoshi, Boolean storeTuihuo, Boolean storeShiyong, Boolean storeShiti, Boolean storeXiaoxie, Boolean storeHuodaofk, String storeZy, String storeSlide, String storeSlideUrl, String storePresales, String storeAftersales) {
        super(storeId, storeName, gradeId, memberId, memberName, sellerName, scId, storeCompanyName, provinceId, areaInfo, storeAddress, storeZip, storeState, storeCloseInfo, storeSort, storeTime, storeEndTime, storeLabel, storeBanner, storeAvatar, storeKeywords, storeDescription, storeQq, storeWw, storePhone, storeDomain, storeDomainTimes, storeRecommend, storeTheme, storeCredit, storeDesccredit, storeServicecredit, storeDeliverycredit, storeCollect, storeStamp, storePrintdesc, storeSales, storeWorkingtime, storeFreePrice, storeDecorationSwitch, storeDecorationOnly, storeDecorationImageCount, liveStoreName, liveStoreAddress, liveStoreTel, liveStoreBus, isOwnShop, bindAllGc, storeVrcodePrefix, storeBaozh, storeBaozhopen, storeBaozhrmb, storeQtian, storeZhping, storeErxiaoshi, storeTuihuo, storeShiyong, storeShiti, storeXiaoxie, storeHuodaofk);
        this.storeZy = storeZy;
        this.storeSlide = storeSlide;
        this.storeSlideUrl = storeSlideUrl;
        this.storePresales = storePresales;
        this.storeAftersales = storeAftersales;
    }

    public StoreWithBLOBs() {
        super();
    }

    public String getStoreZy() {
        return storeZy;
    }

    public void setStoreZy(String storeZy) {
        this.storeZy = storeZy == null ? null : storeZy.trim();
    }

    public String getStoreSlide() {
        return storeSlide;
    }

    public void setStoreSlide(String storeSlide) {
        this.storeSlide = storeSlide == null ? null : storeSlide.trim();
    }

    public String getStoreSlideUrl() {
        return storeSlideUrl;
    }

    public void setStoreSlideUrl(String storeSlideUrl) {
        this.storeSlideUrl = storeSlideUrl == null ? null : storeSlideUrl.trim();
    }

    public String getStorePresales() {
        return storePresales;
    }

    public void setStorePresales(String storePresales) {
        this.storePresales = storePresales == null ? null : storePresales.trim();
    }

    public String getStoreAftersales() {
        return storeAftersales;
    }

    public void setStoreAftersales(String storeAftersales) {
        this.storeAftersales = storeAftersales == null ? null : storeAftersales.trim();
    }
}