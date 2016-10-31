package com.slipstreamcommunications.seedsthatfeed;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import android.view.View;

/**
 *  The 1st Activity (screen) displayed to the user on app launch. Uses the activity_top_level.xml
 *  layout to display:
 *  - Seeds that Feed logo
 *  - A list, consisting of the following selections:
 *    - Contacts (not operable)
 *    - Distribution Locations (not operable)
 *    - Partners (not operable)
 *    - Suppliers (not operable)
 *    - Produce
 *
 *  Selecting "Produce" sends an intent to the Android system, which then passes the intent to the
 *  Produce Category Activity.
 *  @author Jodi A. DeGrave
 *  @version 1.0.0
 *  @param ((savedInstanceState))
 *  @see android.app.Activity, activity_top_level.xml, ProduceCategoryActivity
 */



public class TopLevelActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        /**
         * Create a listener to handle user selection of the list view. Only active for the Produce
         * option. When Produce is selected, create intent to start the Produce Category Activity.
         */
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?>  listView,
                                    View view,
                                    int position,
                                    long id){

                //Select "Produce" option
                if (position == 4) {
                    Intent intent = new Intent(TopLevelActivity.this,ProduceCategoryActivity.class);
                    startActivity(intent);
                }
            }
        };

        //Link the listener to the list view
        ListView listView = (ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);

    }

}   //end class
