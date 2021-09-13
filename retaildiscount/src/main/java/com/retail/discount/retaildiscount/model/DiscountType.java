package com.retail.discount.retaildiscount.model;

public enum DiscountType {

    //Employees discount 30%
    EMPLOYEE_DISCOUNT,

    //Affiliates discount 10%
    AFFILIATE_DISCOUNT,

    /**
     * Discount for user that has been customer for more that 2 years.
     */
    LOYALTY_DISCOUNT,

    //2 years or more loyalty discount 5%
    NONE
}