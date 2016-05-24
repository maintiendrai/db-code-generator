package com.lilkr.model;

import java.math.BigDecimal;
import java.util.Date;

public class Member {
    private Integer memberId;

    private String memberName;

    private String memberTruename;

    private String memberAvatar;

    private Boolean memberSex;

    private Date memberBirthday;

    private String memberPasswd;

    private String memberPaypwd;

    private String memberEmail;

    private Byte memberEmailBind;

    private String memberMobile;

    private Byte memberMobileBind;

    private String memberQq;

    private String memberWw;

    private Integer memberLoginNum;

    private String memberTime;

    private String memberLoginTime;

    private String memberOldLoginTime;

    private String memberLoginIp;

    private String memberOldLoginIp;

    private String memberQqopenid;

    private String memberSinaopenid;

    private Integer memberPoints;

    private BigDecimal availablePredeposit;

    private BigDecimal freezePredeposit;

    private BigDecimal availableRcBalance;

    private BigDecimal freezeRcBalance;

    private Boolean informAllow;

    private Boolean isBuy;

    private Boolean isAllowtalk;

    private Boolean memberState;

    private Integer memberSnsvisitnum;

    private Integer memberAreaid;

    private Integer memberCityid;

    private Integer memberProvinceid;

    private String memberAreainfo;

    private String memberQuicklink;

    private Integer memberExppoints;

    private Integer inviterId;

    public Member(Integer memberId, String memberName, String memberTruename, String memberAvatar, Boolean memberSex, Date memberBirthday, String memberPasswd, String memberPaypwd, String memberEmail, Byte memberEmailBind, String memberMobile, Byte memberMobileBind, String memberQq, String memberWw, Integer memberLoginNum, String memberTime, String memberLoginTime, String memberOldLoginTime, String memberLoginIp, String memberOldLoginIp, String memberQqopenid, String memberSinaopenid, Integer memberPoints, BigDecimal availablePredeposit, BigDecimal freezePredeposit, BigDecimal availableRcBalance, BigDecimal freezeRcBalance, Boolean informAllow, Boolean isBuy, Boolean isAllowtalk, Boolean memberState, Integer memberSnsvisitnum, Integer memberAreaid, Integer memberCityid, Integer memberProvinceid, String memberAreainfo, String memberQuicklink, Integer memberExppoints, Integer inviterId) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberTruename = memberTruename;
        this.memberAvatar = memberAvatar;
        this.memberSex = memberSex;
        this.memberBirthday = memberBirthday;
        this.memberPasswd = memberPasswd;
        this.memberPaypwd = memberPaypwd;
        this.memberEmail = memberEmail;
        this.memberEmailBind = memberEmailBind;
        this.memberMobile = memberMobile;
        this.memberMobileBind = memberMobileBind;
        this.memberQq = memberQq;
        this.memberWw = memberWw;
        this.memberLoginNum = memberLoginNum;
        this.memberTime = memberTime;
        this.memberLoginTime = memberLoginTime;
        this.memberOldLoginTime = memberOldLoginTime;
        this.memberLoginIp = memberLoginIp;
        this.memberOldLoginIp = memberOldLoginIp;
        this.memberQqopenid = memberQqopenid;
        this.memberSinaopenid = memberSinaopenid;
        this.memberPoints = memberPoints;
        this.availablePredeposit = availablePredeposit;
        this.freezePredeposit = freezePredeposit;
        this.availableRcBalance = availableRcBalance;
        this.freezeRcBalance = freezeRcBalance;
        this.informAllow = informAllow;
        this.isBuy = isBuy;
        this.isAllowtalk = isAllowtalk;
        this.memberState = memberState;
        this.memberSnsvisitnum = memberSnsvisitnum;
        this.memberAreaid = memberAreaid;
        this.memberCityid = memberCityid;
        this.memberProvinceid = memberProvinceid;
        this.memberAreainfo = memberAreainfo;
        this.memberQuicklink = memberQuicklink;
        this.memberExppoints = memberExppoints;
        this.inviterId = inviterId;
    }

    public Member() {
        super();
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

    public String getMemberTruename() {
        return memberTruename;
    }

    public void setMemberTruename(String memberTruename) {
        this.memberTruename = memberTruename == null ? null : memberTruename.trim();
    }

    public String getMemberAvatar() {
        return memberAvatar;
    }

    public void setMemberAvatar(String memberAvatar) {
        this.memberAvatar = memberAvatar == null ? null : memberAvatar.trim();
    }

    public Boolean getMemberSex() {
        return memberSex;
    }

    public void setMemberSex(Boolean memberSex) {
        this.memberSex = memberSex;
    }

    public Date getMemberBirthday() {
        return memberBirthday;
    }

    public void setMemberBirthday(Date memberBirthday) {
        this.memberBirthday = memberBirthday;
    }

    public String getMemberPasswd() {
        return memberPasswd;
    }

    public void setMemberPasswd(String memberPasswd) {
        this.memberPasswd = memberPasswd == null ? null : memberPasswd.trim();
    }

    public String getMemberPaypwd() {
        return memberPaypwd;
    }

    public void setMemberPaypwd(String memberPaypwd) {
        this.memberPaypwd = memberPaypwd == null ? null : memberPaypwd.trim();
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail == null ? null : memberEmail.trim();
    }

    public Byte getMemberEmailBind() {
        return memberEmailBind;
    }

    public void setMemberEmailBind(Byte memberEmailBind) {
        this.memberEmailBind = memberEmailBind;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile == null ? null : memberMobile.trim();
    }

    public Byte getMemberMobileBind() {
        return memberMobileBind;
    }

    public void setMemberMobileBind(Byte memberMobileBind) {
        this.memberMobileBind = memberMobileBind;
    }

    public String getMemberQq() {
        return memberQq;
    }

    public void setMemberQq(String memberQq) {
        this.memberQq = memberQq == null ? null : memberQq.trim();
    }

    public String getMemberWw() {
        return memberWw;
    }

    public void setMemberWw(String memberWw) {
        this.memberWw = memberWw == null ? null : memberWw.trim();
    }

    public Integer getMemberLoginNum() {
        return memberLoginNum;
    }

    public void setMemberLoginNum(Integer memberLoginNum) {
        this.memberLoginNum = memberLoginNum;
    }

    public String getMemberTime() {
        return memberTime;
    }

    public void setMemberTime(String memberTime) {
        this.memberTime = memberTime == null ? null : memberTime.trim();
    }

    public String getMemberLoginTime() {
        return memberLoginTime;
    }

    public void setMemberLoginTime(String memberLoginTime) {
        this.memberLoginTime = memberLoginTime == null ? null : memberLoginTime.trim();
    }

    public String getMemberOldLoginTime() {
        return memberOldLoginTime;
    }

    public void setMemberOldLoginTime(String memberOldLoginTime) {
        this.memberOldLoginTime = memberOldLoginTime == null ? null : memberOldLoginTime.trim();
    }

    public String getMemberLoginIp() {
        return memberLoginIp;
    }

    public void setMemberLoginIp(String memberLoginIp) {
        this.memberLoginIp = memberLoginIp == null ? null : memberLoginIp.trim();
    }

    public String getMemberOldLoginIp() {
        return memberOldLoginIp;
    }

    public void setMemberOldLoginIp(String memberOldLoginIp) {
        this.memberOldLoginIp = memberOldLoginIp == null ? null : memberOldLoginIp.trim();
    }

    public String getMemberQqopenid() {
        return memberQqopenid;
    }

    public void setMemberQqopenid(String memberQqopenid) {
        this.memberQqopenid = memberQqopenid == null ? null : memberQqopenid.trim();
    }

    public String getMemberSinaopenid() {
        return memberSinaopenid;
    }

    public void setMemberSinaopenid(String memberSinaopenid) {
        this.memberSinaopenid = memberSinaopenid == null ? null : memberSinaopenid.trim();
    }

    public Integer getMemberPoints() {
        return memberPoints;
    }

    public void setMemberPoints(Integer memberPoints) {
        this.memberPoints = memberPoints;
    }

    public BigDecimal getAvailablePredeposit() {
        return availablePredeposit;
    }

    public void setAvailablePredeposit(BigDecimal availablePredeposit) {
        this.availablePredeposit = availablePredeposit;
    }

    public BigDecimal getFreezePredeposit() {
        return freezePredeposit;
    }

    public void setFreezePredeposit(BigDecimal freezePredeposit) {
        this.freezePredeposit = freezePredeposit;
    }

    public BigDecimal getAvailableRcBalance() {
        return availableRcBalance;
    }

    public void setAvailableRcBalance(BigDecimal availableRcBalance) {
        this.availableRcBalance = availableRcBalance;
    }

    public BigDecimal getFreezeRcBalance() {
        return freezeRcBalance;
    }

    public void setFreezeRcBalance(BigDecimal freezeRcBalance) {
        this.freezeRcBalance = freezeRcBalance;
    }

    public Boolean getInformAllow() {
        return informAllow;
    }

    public void setInformAllow(Boolean informAllow) {
        this.informAllow = informAllow;
    }

    public Boolean getIsBuy() {
        return isBuy;
    }

    public void setIsBuy(Boolean isBuy) {
        this.isBuy = isBuy;
    }

    public Boolean getIsAllowtalk() {
        return isAllowtalk;
    }

    public void setIsAllowtalk(Boolean isAllowtalk) {
        this.isAllowtalk = isAllowtalk;
    }

    public Boolean getMemberState() {
        return memberState;
    }

    public void setMemberState(Boolean memberState) {
        this.memberState = memberState;
    }

    public Integer getMemberSnsvisitnum() {
        return memberSnsvisitnum;
    }

    public void setMemberSnsvisitnum(Integer memberSnsvisitnum) {
        this.memberSnsvisitnum = memberSnsvisitnum;
    }

    public Integer getMemberAreaid() {
        return memberAreaid;
    }

    public void setMemberAreaid(Integer memberAreaid) {
        this.memberAreaid = memberAreaid;
    }

    public Integer getMemberCityid() {
        return memberCityid;
    }

    public void setMemberCityid(Integer memberCityid) {
        this.memberCityid = memberCityid;
    }

    public Integer getMemberProvinceid() {
        return memberProvinceid;
    }

    public void setMemberProvinceid(Integer memberProvinceid) {
        this.memberProvinceid = memberProvinceid;
    }

    public String getMemberAreainfo() {
        return memberAreainfo;
    }

    public void setMemberAreainfo(String memberAreainfo) {
        this.memberAreainfo = memberAreainfo == null ? null : memberAreainfo.trim();
    }

    public String getMemberQuicklink() {
        return memberQuicklink;
    }

    public void setMemberQuicklink(String memberQuicklink) {
        this.memberQuicklink = memberQuicklink == null ? null : memberQuicklink.trim();
    }

    public Integer getMemberExppoints() {
        return memberExppoints;
    }

    public void setMemberExppoints(Integer memberExppoints) {
        this.memberExppoints = memberExppoints;
    }

    public Integer getInviterId() {
        return inviterId;
    }

    public void setInviterId(Integer inviterId) {
        this.inviterId = inviterId;
    }
}