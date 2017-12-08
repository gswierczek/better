package com.codistica.better.controller;
import com.codistica.better.model.Coupon;
import com.codistica.better.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Author Grzegorz Swierczek
 * Created on 2017-12-08
 * Contact g.swierczek@gmail.com
 */

@RestController
public class CouponController {

    @Autowired
    private CouponService couponService;

    @RequestMapping("/coupons")
    public List<Coupon> allCoupons() {
        return couponService.getAll();
    }

    @RequestMapping("/coupons/{id}")
    public Coupon getCouponById(@PathVariable Integer id) {
        return couponService.getCouponById(id);
    }

    @RequestMapping(value = "/coupons", method = RequestMethod.POST)
    public void createCoupon(@RequestBody Coupon coupon) {
        couponService.createCoupon(coupon);
    }

    @RequestMapping(value = "/coupons/{id}", method = RequestMethod.PUT)
    public void updateCoupon(@RequestBody Coupon coupon, @PathVariable Integer id) {
        couponService.updateCoupon(coupon, id);
    }

    @RequestMapping(value = "/coupons/{id}", method = RequestMethod.DELETE)
    public void deleteCoupon(@PathVariable Integer id) {
        couponService.deleteCoupon(id);
    }
}
