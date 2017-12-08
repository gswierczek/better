package com.codistica.better.repository;

import com.codistica.better.model.Bet;
import org.springframework.data.repository.CrudRepository;

/**
 * Author Grzegorz Swierczek
 * Created on 2017-12-08
 * Contact g.swierczek@gmail.com
 */

public interface BetRepository extends CrudRepository<Bet, Integer> {
}
