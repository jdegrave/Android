package com.slipstreamcommunications.seedsthatfeed;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;

/**
 *  The 2nd Activity (screen) displayed after selecting Produce from Top Level Activity.
 *  Does not use any XML as this Activity is a ListActivity which has its own layout built in (but
 *  could be replaced.
 *  Displays a list, consisting of the following selections:
 *    - Fruit
 *    - Vegetables(not operable)
 *
 *  The list is populated via an array of values derived from the ProduceCategory class
 *  Upon selection of "Fruit", an intent is sent to the Android system which is then sent to
 *  ProduceListActivity to display the list of available fruits.
 *
 *  @author Jodi A. DeGrave
 *  @version 1.0.0
 *  @param ((savedInstanceState))
 *  @see android.app.ListActivity; ProduceCategory
 */


public class ProduceCategoryActivity extends ListActivity {

    //Create the Produce Category activity and create a list adapter so it can link the List View
    //to the data source (which is an array in the ProduceCategory class). List adapter acts as a bridge
    //between the List View and the data source.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listProduceTypes = getListView();
        ArrayAdapter<ProduceCategory> listAdapter = new ArrayAdapter<ProduceCategory>(
                this,
                android.R.layout.simple_expandable_list_item_1,
                ProduceCategory.availProduceCategories);

        //Attach the list adapter to the List view
        listProduceTypes.setAdapter(listAdapter);


    }


    //Send an intent to Android, which then sends the intent to ProduceListActivity if the user selects the
    //"Fruit" option
    @Override
    public void onListItemClick(ListView fruitListView,
                                View fruitItemView,
                                int position,
                                long id) {

        if (position == 0) {
            Intent intent = new Intent(ProduceCategoryActivity.this, ProduceListActivity.class);
            //intent.putExtra(FruitActivity.EXTRA_FRUITNO, (int) id);
            startActivity(intent);
        }

    }


}   // end of class
