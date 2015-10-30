package com.example.kimaiga.idleloio;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Kimaiga on 10/29/2015.
 */




public class Events extends Activity {
    private ListView lv;

    @overide
    public void onCreate(Bundle saveInstanceState) {
        setContentView(R.layout.events);

        lv = (ListView) findViewById(R.id.Eventslist);

        // Instanciating an array list (you don't need to do this,
        // you already have yours).
        List<String> EventsList = new ArrayList<String>();
        EventsList.add("foo");
        EventsList.add("bar");

        // This is the array adapter, it takes the context of the activity as a
        // first parameter, the type of list view as a second parameter and your
        // array as a third parameter.
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                EventsList );

        lv.setAdapter(arrayAdapter);
    }

}
