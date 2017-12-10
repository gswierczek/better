package com.codistica.better.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.math.BigDecimal;
import java.util.List;

/**
 * Author Grzegorz Swierczek
 * Created on 2017-12-08
 * Contact g.swierczek@gmail.com
 */
@Entity
@Data
public class Coupon {

    @Id
    private Integer id;
    private BigDecimal stake;
    private String bet;

    public Coupon() {
    }

    public Coupon(Integer id, BigDecimal stake, String bet) {
        this.id = id;
        this.stake = stake;
        this.bet = bet;
    }
}
