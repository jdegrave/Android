package com.slipstreamcommunications.seedsthatfeed;


import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;

/**
 * 3rd Activity (screen) displayed after user selects "Fruit" from ProductCategoryActivity:
 * - Apples
 * - Grapes
 * - Bananas
 * The Fruit class is the source of the list (held in an object array of type Fruit)
 * Selection of a fruit creates an intent sent to the Android system which in turn
 * passes the intent to FruitActivity. FruitActivity displays the details.
 *
 * ProduceListActivity is a ListActivity and has no accompanying XML layout (it's built in to the
 * ListActivity)
 *
 *
 *
 * @author Jodi A DeGrave
 * @version 1.0.0
 * @params ((savedInstanceState)
 * @see android.app.ListActivity, ProduceCategoryActivity, FruitActivity, Fruit class
 */

public class ProduceListActivity extends ListActivity {

    //Create an array adapter to and link to the listview to retrieve fruits
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listView = getListView();
        ArrayAdapter<Fruit> listAdapter = new ArrayAdapter<Fruit>(
                this,
                android.R.layout.simple_expandable_list_item_1,
                Fruit.availFruits);
        listView.setAdapter(listAdapter);
    }


    //Call FruitActivity to display fruit detail in a ListActivity
    //EXTRA_FRUITNO is a constanct declared in FruitActivity; it saves the selection ID
    //from ProduceListActivity. This is also the index for the fruit object in the
    //availFruits array in the Fruit class.

    @Override
    protected void onListItemClick(ListView listView,
                                   View itemView,
                                   int position,
                                   long id) {

        Intent intent = new Intent(ProduceListActivity.this, FruitActivity.class);
        intent.putExtra(FruitActivity.EXTRA_FRUITNO, (int)id);
        startActivity(intent);
    }


}   //end class

