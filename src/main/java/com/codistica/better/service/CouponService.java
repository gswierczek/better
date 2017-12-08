package com.codistica.better.service;

import com.codistica.better.model.Bet;
import com.codistica.better.model.Coupon;
import com.codistica.better.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.codistica.better.model.BetStatus.WON;
import static com.codistica.better.model.Pick.AWAY;
import static com.codistica.better.model.Pick.HOME;

/**
 * Author Grzegorz Swierczek
 * Created on 2017-12-08
 * Contact g.swierczek@gmail.com
 */

@Service
public class CouponService {

    @Autowired
    private CouponRepository couponRepository;

    public List<Coupon> getAll() {
        List<Coupon> coupons = new ArrayList<>();
        couponRepository.findAll().forEach(coupons::add);
        return coupons;
    }

    public Coupon getCouponById(Integer id) {
        return couponRepository.findOne(id);
    }

    public void createCoupon(Coupon coupon) {
        couponRepository.save(coupon);
    }

    public void updateCoupon(Coupon coupon, Integer id) {
        couponRepository.save(coupon);
    }

    public void deleteCoupon(Integer id) {
        couponRepository.delete(id);
    }
}
