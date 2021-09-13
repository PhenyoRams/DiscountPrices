package com.retail.discount.retaildiscount.service;
import com.retail.discount.retaildiscount.model.DiscountType;
import com.retail.discount.retaildiscount.model.UserType;
import java.util.function.Function;


public interface DiscountMappingService {
    
    DiscountType getDiscountByUserType(UserType userType);
    Function<Double, Double> getFunctionByDiscount(DiscountType discountType);
}
