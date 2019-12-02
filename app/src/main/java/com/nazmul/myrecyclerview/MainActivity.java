package com.nazmul.myrecyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {


    String countryList[]={"Bangladesh","India","China","Australia","America","New Zealand","Portugal"};
    int imgList[]={R.drawable.bd,R.drawable.india,R.drawable.china,R.drawable.australia,R.drawable.america,R.drawable.new_zealand,R.drawable.portugle};

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         // get the referances of recycler view
        recyclerView = findViewById(R.id.recycler_view);

        // set a LinearLayoutManager with default vertical orientation

         LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());

         recyclerView.setLayoutManager(linearLayoutManager);


         // call the constructor of customAdapter to send the reference and data to Adapter
        CustomAdapter customAdapter= new CustomAdapter(MainActivity.this,countryList,imgList);
        recyclerView.setAdapter(customAdapter);



    }
}
