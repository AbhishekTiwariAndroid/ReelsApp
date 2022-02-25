package com.example.reelsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private List<Video> videoList;
    private VideoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoList = new ArrayList<>(  );
        viewPager2 = findViewById(R.id.viewPager2);

        videoList.add(new Video("android.resource://" + getPackageName() + "/" + R.raw.a,"Barsaat ki Dhun", "Sun sun sun barsaat ki dhun status  barsaat ki dhun song  whatsapp status jubin nautiyal Shorts_v720P"));
        videoList.add(new Video("android.resource://" + getPackageName() + "/" + R.raw.b,"Tumse Pyar Karke", "Tumse Pyar Karke ft Tulsi Kumar  Jubin Nautiyal  Gurmeet Choudhary  Muskan Kalra Shorts_v720P"));
        videoList.add(new Video("android.resource://" + getPackageName() + "/" + R.raw.c,"OAasmanWale", "Jo Dil Diya Tha Tune♥️♥️Toh Fir Dard Kyun Diya _ #OAasmanWale#JubinsJan #ytshorts"));
        videoList.add(new Video("android.resource://" + getPackageName() + "/" + R.raw.d,"Dhoka", "Dhoka Song Status trending tseries shorts status viral_v720P"));

        adapter = new VideoAdapter(videoList);
        viewPager2.setAdapter(adapter);
    }
}