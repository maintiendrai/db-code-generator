package com.lilkr.model;

public class Area {
    private Integer areaId;

    private String areaName;

    private Integer areaParentId;

    private Byte areaSort;

    private Boolean areaDeep;

    private String areaRegion;

    public Area(Integer areaId, String areaName, Integer areaParentId, Byte areaSort, Boolean areaDeep, String areaRegion) {
        this.areaId = areaId;
        this.areaName = areaName;
        this.areaParentId = areaParentId;
        this.areaSort = areaSort;
        this.areaDeep = areaDeep;
        this.areaRegion = areaRegion;
    }

    public Area() {
        super();
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public Integer getAreaParentId() {
        return areaParentId;
    }

    public void setAreaParentId(Integer areaParentId) {
        this.areaParentId = areaParentId;
    }

    public Byte getAreaSort() {
        return areaSort;
    }

    public void setAreaSort(Byte areaSort) {
        this.areaSort = areaSort;
    }

    public Boolean getAreaDeep() {
        return areaDeep;
    }

    public void setAreaDeep(Boolean areaDeep) {
        this.areaDeep = areaDeep;
    }

    public String getAreaRegion() {
        return areaRegion;
    }

    public void setAreaRegion(String areaRegion) {
        this.areaRegion = areaRegion == null ? null : areaRegion.trim();
    }
}