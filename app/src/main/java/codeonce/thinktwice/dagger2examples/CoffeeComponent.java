package codeonce.thinktwice.dagger2examples;

import javax.inject.Singleton;

import dagger.Component;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/2/2017.
 */

@Singleton
@Component(modules = { DripCoffeeModule.class})
public interface CoffeeComponent {
    CoffeeMaker createCoffeeMaker();
}
