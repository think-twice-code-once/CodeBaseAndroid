package dagger2.codebase.services;

import javax.inject.Inject;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/2/2017.
 */

public class Street {

    private Coach coach;
    private Player player;

    @Inject
    Street(Coach coach, Player player) {
        this.coach = coach;
        this.player = player;
    }

    void playOnStreet() {
        coach.makeDecision();
        player.shoot();
        player.shoot();
        player.shoot();
        coach.makeDecision();
    }
}
