package com.codistica.better.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * Author Grzegorz Swierczek
 * Created on 2017-12-08
 * Contact g.swierczek@gmail.com
 */

@Data
public class Coupon {
    private Integer id;
    private BigDecimal stake;
    private List<Bet> bets;

    public Coupon() {
    }

    public Coupon(Integer id, BigDecimal stake, List<Bet> bets) {
        this.id = id;
        this.stake = stake;
        this.bets = bets;
    }
}
