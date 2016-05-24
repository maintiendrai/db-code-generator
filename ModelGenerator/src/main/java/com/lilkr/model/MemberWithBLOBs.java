package com.lilkr.model;

public class MemberWithBLOBs extends Member {
    private String memberQqinfo;

    private String memberSinainfo;

    private String memberPrivacy;

    public MemberWithBLOBs(Integer memberId, String memberName, String memberTruename, String memberAvatar, Boolean memberSex, Date memberBirthday, String memberPasswd, String memberPaypwd, String memberEmail, Byte memberEmailBind, String memberMobile, Byte memberMobileBind, String memberQq, String memberWw, Integer memberLoginNum, String memberTime, String memberLoginTime, String memberOldLoginTime, String memberLoginIp, String memberOldLoginIp, String memberQqopenid, String memberSinaopenid, Integer memberPoints, BigDecimal availablePredeposit, BigDecimal freezePredeposit, BigDecimal availableRcBalance, BigDecimal freezeRcBalance, Boolean informAllow, Boolean isBuy, Boolean isAllowtalk, Boolean memberState, Integer memberSnsvisitnum, Integer memberAreaid, Integer memberCityid, Integer memberProvinceid, String memberAreainfo, String memberQuicklink, Integer memberExppoints, Integer inviterId, String memberQqinfo, String memberSinainfo, String memberPrivacy) {
        super(memberId, memberName, memberTruename, memberAvatar, memberSex, memberBirthday, memberPasswd, memberPaypwd, memberEmail, memberEmailBind, memberMobile, memberMobileBind, memberQq, memberWw, memberLoginNum, memberTime, memberLoginTime, memberOldLoginTime, memberLoginIp, memberOldLoginIp, memberQqopenid, memberSinaopenid, memberPoints, availablePredeposit, freezePredeposit, availableRcBalance, freezeRcBalance, informAllow, isBuy, isAllowtalk, memberState, memberSnsvisitnum, memberAreaid, memberCityid, memberProvinceid, memberAreainfo, memberQuicklink, memberExppoints, inviterId);
        this.memberQqinfo = memberQqinfo;
        this.memberSinainfo = memberSinainfo;
        this.memberPrivacy = memberPrivacy;
    }

    public MemberWithBLOBs() {
        super();
    }

    public String getMemberQqinfo() {
        return memberQqinfo;
    }

    public void setMemberQqinfo(String memberQqinfo) {
        this.memberQqinfo = memberQqinfo == null ? null : memberQqinfo.trim();
    }

    public String getMemberSinainfo() {
        return memberSinainfo;
    }

    public void setMemberSinainfo(String memberSinainfo) {
        this.memberSinainfo = memberSinainfo == null ? null : memberSinainfo.trim();
    }

    public String getMemberPrivacy() {
        return memberPrivacy;
    }

    public void setMemberPrivacy(String memberPrivacy) {
        this.memberPrivacy = memberPrivacy == null ? null : memberPrivacy.trim();
    }
}