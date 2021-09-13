package com.retail.discount.retaildiscount.model;

public class BillingInfo {
    private boolean containsGroceries;

     // Information can be of any type
    private User<String> userInfo;

    private Double amount;

    private Object otherData;

    //Here we create the getters and setters
    public boolean isContainingGroceries() {
        return containsGroceries;
    }

    public void setContainingGroceries(boolean containsGroceries) {
        this.containsGroceries = containsGroceries;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public User<String> getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(User<String> userInfo) {
        this.userInfo = userInfo;
    }

    public Object getOtherData() {
        return otherData;
    }

    public void setOtherData(Object otherData) {
        this.otherData = otherData;
    }
}
