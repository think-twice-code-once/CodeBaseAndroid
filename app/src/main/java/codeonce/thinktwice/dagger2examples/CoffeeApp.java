package codeonce.thinktwice.dagger2examples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class CoffeeApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CoffeeComponent coffeeComponent = DaggerCoffeeComponent.builder().build();
        coffeeComponent.createCoffeeMaker().brew();
    }
}
