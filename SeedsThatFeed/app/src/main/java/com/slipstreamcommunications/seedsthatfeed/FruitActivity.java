package com.slipstreamcommunications.seedsthatfeed;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.GridLayout;
import android.widget.TextView;

/**
 * Receives the intent and ID from ProduceListActivity and uses it as the index for the
 * Fruit array. Uses the getters from the Fruit class to populate details about the fruit
 * selected from ProduceListActivity. It also provides the total count for all fruit, displayed with
 * each fruit's details:
 * - Image of fruit
 * - Fruit name
 * - Fruit color
 * - Fruit Quantity
 * - Total Fruit
 *
 * Uses activity_fruit.xml for layout
 *
 * Declares EXTRA_FRUITNO as a constant to ensure clarity that it's the same variable being used
 * between ProduceListActivity and itself when receiving the intent from ProduceListActivity
 *
 * 4th Activity in the app.
 *
 * @author Jodi A DeGrave
 * @version 1.0.0
 * @see android.app.Activity, Fruit class, ProduceListActivity
 */

public class FruitActivity extends Activity {

    public static final String EXTRA_FRUITNO = "fruitNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        //get the fruit from the intent
        int fruitNo = (int) getIntent().getExtras().get(EXTRA_FRUITNO);
       // int fruitArrayLength = Fruit.availFruits.length;


        Fruit fruit = Fruit.availFruits[fruitNo];  //change back to "i" when you figure out grid layout

        //Populate the fruit image
        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(fruit.getImageResourceId());
        photo.setContentDescription(fruit.getFruitName());


        //Populate the fruit name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(fruit.getFruitName());

        //Populate the fruit color
        TextView fruitColor = (TextView) findViewById(R.id.fruit_color);
        fruitColor.setText(fruit.getFruitColor());

        //Populate the fruit quantity
        TextView quantity = (TextView) findViewById(R.id.fruit_quantity);
        quantity.setText(fruit.getFruitQuantity());

        //Populate the total fruit count
        TextView totalFruit = (TextView) findViewById(R.id.total_fruit);
        totalFruit.setText(fruit.getTotalFruit());


    }

}
