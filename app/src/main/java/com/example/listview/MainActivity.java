package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ListView listView;
public static  final  String mobilephones[] = {

"Galaxy Note8","Galaxy Note 9","Iphone X","Iphone XR","Iphone 11 pro max"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = (ListView) findViewById(R.id.listitem);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Hello Kritika Thapa", Toast.LENGTH_SHORT).show();
//            }

        ArrayAdapter ad = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                mobilephones


        );
        listView.setAdapter(ad);
        //functioning listview
         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 Toast.makeText(MainActivity.this,
                         "I will buy:"+ad.getItem(position),
                         Toast.LENGTH_SHORT).show();
             }
         });

    }}