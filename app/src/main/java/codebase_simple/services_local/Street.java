package codebase_simple.services_local;

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

    public void playOnStreet() {
        coach.makeDecision();
        player.shoot();
        player.shoot();
        player.shoot();
        coach.makeDecision();
    }
}
