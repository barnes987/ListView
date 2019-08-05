package com.example.pwpb4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    List<Hero> heroList;

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heroList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView);
//adding some values to our list
        heroList.add(new Hero(R.drawable.spiderman, "Spiderman",
                "Avengers"));
        heroList.add(new Hero(R.drawable.joker, "Joker", "Injustice
                Gang"));

                heroList.add(new Hero(R.drawable.ironman, "Iron Man",
                        "Avengers"));
        heroList.add(new Hero(R.drawable.doctorstrange, "Doctor
                Strange", "Avengers"));
                heroList.add(new Hero(R.drawable.captainamerica, "Captain
                        America", "Avengers"));
                        heroList.add(new Hero(R.drawable.batman, "Batman", "Justice
                                League"));
//creating the adapter
                                MyListAdapter adapter = new MyListAdapter(this,
                                R.layout.my_custom_list, heroList);
//attaching adapter to the listview
        listView.setAdapter(adapter);
    }
}
