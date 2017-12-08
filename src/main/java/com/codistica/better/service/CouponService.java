package com.codistica.better.service;

import com.codistica.better.model.Bet;
import com.codistica.better.model.Coupon;
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

    private List<Coupon> coupons = new ArrayList<>(Arrays.asList(
                    new Coupon(1, BigDecimal.valueOf(1000), Arrays.asList(
                                    new Bet(HOME, 1.30, WON))),
                    new Coupon(2, BigDecimal.valueOf(2000), Arrays.asList(
                                    new Bet(AWAY, 1.45, WON),
                                    new Bet(HOME, 1.25, WON)))
    ));

    public List<Coupon> getAll() {
        return coupons;
    }

    public Coupon getCouponById(Integer id) {
        return coupons.stream().filter(c -> c.getId().equals(id)).findFirst().get();
    }

    public void createCoupon(Coupon coupon) {
        coupons.add(coupon);
    }

    public void updateCoupon(Coupon coupon, Integer id) {
        for (int i = 0; i < coupons.size(); i++) {
            Coupon c = coupons.get(i);
            if (c.getId().equals(id)) {
                coupons.set(i, coupon);
                return;
            }
        }
    }

    public void deleteCoupon(Integer id) {
        coupons.removeIf(c -> c.getId().equals(id));
    }
}
