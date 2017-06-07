package dagger2.codebase.services;

import android.util.Log;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/2/2017.
 */

public class Player extends Person {

    private String type;

    public Player(String name, int age) {
        super(name, age);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    void shoot() {
        Log.d(Value.LOG_TAG, "Player: (" + getName() + " ; " + getAge() + ") Shooting the ball ...");
    }
}
