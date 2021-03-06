package codebase_simple.services_local;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/2/2017.
 */

public abstract class Person {

    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
