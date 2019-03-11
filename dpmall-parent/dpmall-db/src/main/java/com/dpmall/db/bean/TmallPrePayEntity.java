package com.dpmall.db.bean;

/***
 * 天猫的特权订金  列表信息
 */
public class TmallPrePayEntity  {

    /**特权订金id**/
    private String prePayId;

    /**特权订金号**/
    private String prePayCode;

    /**名称**/
    private String prePayName;

    /**推荐门店**/
    private String suggestStoreName;

    /**有效时间**/
    private String effectiveTime;

    /**服务地址**/
    private String serviceAddress;

    /**接单时间**/
    private String acceptTime;


    /**接单时间**/
    private String phone;

    /**是否经销商**/
    private String isAgency;


    /**门店列表状态**/
    private String storeStatus;
    /**经销商名称**/
    private String agencyName;


    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getStoreStatus() {
        return storeStatus;
    }

    public void setStoreStatus(String storeStatus) {
        this.storeStatus = storeStatus;
    }

    public String getIsAgency() {
        return isAgency;
    }

    public void setIsAgency(String isAgency) {
        this.isAgency = isAgency;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPrePayId() {
        return prePayId;
    }

    public void setPrePayId(String prePayId) {
        this.prePayId = prePayId;
    }

    public String getPrePayCode() {
        return prePayCode;
    }

    public void setPrePayCode(String prePayCode) {
        this.prePayCode = prePayCode;
    }

    public String getPrePayName() {
        return prePayName;
    }

    public void setPrePayName(String prePayName) {
        this.prePayName = prePayName;
    }

    public String getSuggestStoreName() {
        return suggestStoreName;
    }

    public void setSuggestStoreName(String suggestStoreName) {
        this.suggestStoreName = suggestStoreName;
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    public String getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(String acceptTime) {
        this.acceptTime = acceptTime;
    }
}
