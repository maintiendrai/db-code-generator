package com.lilkr.model;

public class StoreExtend {
    private Integer storeId;

    private String express;

    private String pricerange;

    private String orderpricerange;

    public StoreExtend(Integer storeId, String express, String pricerange, String orderpricerange) {
        this.storeId = storeId;
        this.express = express;
        this.pricerange = pricerange;
        this.orderpricerange = orderpricerange;
    }

    public StoreExtend() {
        super();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getExpress() {
        return express;
    }

    public void setExpress(String express) {
        this.express = express == null ? null : express.trim();
    }

    public String getPricerange() {
        return pricerange;
    }

    public void setPricerange(String pricerange) {
        this.pricerange = pricerange == null ? null : pricerange.trim();
    }

    public String getOrderpricerange() {
        return orderpricerange;
    }

    public void setOrderpricerange(String orderpricerange) {
        this.orderpricerange = orderpricerange == null ? null : orderpricerange.trim();
    }
}