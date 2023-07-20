package sg.edu.rp.c346.id22000210.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import sg.edu.rp.c346.id22025520.demoandroidlist.CustomAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // step 2 - declare a field for the listview
        ListView listView;

        ArrayList<String> items = new ArrayList();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            // step 3 - link the field to the UI element
            listView = findViewById(R.id.listView);
            ArrayList<Object> ArrayList = new ArrayList<>();

            // set up the contents of the ArrayList
            //items.add("Pie - 9.0");
            //items.add("Oreo - 8.0 - 8.1");
            //items.add("Nougat - 7.0 - 7.1.2");
            //items.add(new AndroidVersion("Pie", "9.0"));
            //items.add(new AndroidVersion("Oreo", "8.0 - 8.1"));
            //items.add(new AndroidVersion("Nougat", "7.0 - 7.1.2"));

            AndroidVersion item1 = new AndroidVersion("Pie", "9.0");
            AndroidVersion item2 = new AndroidVersion("Oreo", "8.0 - 8.1");
            AndroidVersion item3 = new AndroidVersion("Nougat", "7.0 - 7.1.2");

            ArrayList.add(item1);
            ArrayList.add(item2);
            ArrayList.add(item3);

            // step 4 - create the ArrayAdapter, link it to the array
            //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
            //        android.R.layout.simple_list_item_1, items);

            sg.edu.rp.c346.id22025520.demoandroidlist.CustomAdapter adapter = new CustomAdapter(this, R.layout.row, items);

            // step 5 - link the adapter to the list view
            listView.setAdapter(adapter);
        }
    }
}