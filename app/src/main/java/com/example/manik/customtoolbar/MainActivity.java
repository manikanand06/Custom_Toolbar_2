package com.example.manik.customtoolbar;
//Give the Permission
//android:theme="@style/Theme.AppCompat.Light.NoActionBar"

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(Toolbar)findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
    }
    //using Ctrl+o also we can pop up menu for override function

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        switch(id)
        {
            case R.id.aboutus:
                Toast.makeText(this,"About Us Clicked",Toast.LENGTH_SHORT).show();
                break;

            case R.id.setting:
                Toast.makeText(this,"Setting Clicked",Toast.LENGTH_SHORT).show();
                break;

            case R.id.users:
                Toast.makeText(this,"Users Clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.search_id:
                Toast.makeText(this,"Search Clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.cart:
                Toast.makeText(this,"Cart Clicked",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

