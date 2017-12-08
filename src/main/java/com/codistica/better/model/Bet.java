package com.codistica.better.model;

import lombok.Data;

/**
 * Author Grzegorz Swierczek
 * Created on 2017-12-08
 * Contact g.swierczek@gmail.com
 */

@Data
public class Bet {
    private Pick pick;
    private Double odds;
    private BetStatus betStatus;

    public Bet() {
    }

    public Bet(Pick pick, Double odds, BetStatus betStatus) {
        this.pick = pick;
        this.odds = odds;
        this.betStatus = betStatus;
    }
}
