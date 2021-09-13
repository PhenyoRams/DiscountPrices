package com.retail.discount.retaildiscount.service;
import com.retail.discount.retaildiscount.model.Discount;
import com.retail.discount.retaildiscount.model.BillingInfo;

public interface DiscountService {
    //Calculates a discount based on the BillingInformation provided.
    Discount calculateDiscount(BillingInfo billingInfo);
}
