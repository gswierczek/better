package com.codistica.better.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Author Grzegorz Swierczek
 * Created on 2017-12-08
 * Contact g.swierczek@gmail.com
 */
@Entity
@Data
public class Bet {

    @Id
    private Integer id;
    private Pick pick;
    private Double odds;
    private BetStatus betStatus;

    public Bet() {
    }

    public Bet(Integer id, Pick pick, Double odds, BetStatus betStatus) {
        this.id = id;
        this.pick = pick;
        this.odds = odds;
        this.betStatus = betStatus;
    }
}
