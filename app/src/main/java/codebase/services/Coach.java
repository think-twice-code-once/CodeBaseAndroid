package dagger2.codebase.services;

import android.util.Log;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/2/2017.
 */

public class Coach extends Person {

    private int yearOfExperience;

    public Coach(String name, int age) {
        super(name, age);
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    void makeDecision() {
        Log.d(Value.LOG_TAG, "Coach: (" + getName() + " ; " + getAge() + ") go attack !");
    }
}
