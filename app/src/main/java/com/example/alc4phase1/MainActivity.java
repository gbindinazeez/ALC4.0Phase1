package com.example.alc4phase1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//import static com.example.alc4phase1.R.id.profile;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button butt1=(Button)findViewById(R.id.aboutalc);
        //Button butt2=(Button)findViewById(R.id.profile);
        Button butt3=(Button)findViewById(R.id.myprofile);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1= new Intent(MainActivity.this,aboutalc.class);
                startActivity(int1);
            }
        });


        //butt2.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View v) {
//class name can be gotten from the .java file of each view e.g class name of profile is ProfileActivity
              //  Intent int2= new Intent(MainActivity.this,ProfileActivity.class);
                //startActivity(int2);
            //}
        //});

        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3= new Intent(MainActivity.this,myprofile.class);
                startActivity(int3);
            }
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }


    }


