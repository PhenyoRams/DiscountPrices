package com.retail.discount.retaildiscount.controller;

import com.retail.discount.retaildiscount.service.*;
import com.retail.discount.retaildiscount.model.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping(path = "api/v1/discount")

public class RestService {

    @Autowired
    private DiscountService discountService;

    @PostMapping
    public ResponseEntity<Discount> calculateDiscount(@RequestBody BillingInfo billingInfo) {
        Discount discount = discountService.calculateDiscount(billingInfo);
        return new ResponseEntity<>(discount, HttpStatus.OK);
    }
}
