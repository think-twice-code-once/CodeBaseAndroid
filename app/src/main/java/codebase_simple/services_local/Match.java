package codebase_simple.services_local;

import javax.inject.Inject;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/2/2017.
 */

public class Match {

    private Coach coach;
    private Player player;

    @Inject
    Worker worker;

    @Inject
    Advertisement advertisement;

    @Inject
    Match(Coach coach, Player player) {
        this.coach = coach;
        this.player = player;
    }

    public void play() {
        advertisement.advertise();
        worker.clean();
        coach.makeDecision();
        player.shoot();
        coach.makeDecision();
        worker.clean();
    }
}
