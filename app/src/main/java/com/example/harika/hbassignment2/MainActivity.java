package com.example.harika.hbassignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
    getMenuInflater().inflate(R.menu.menu_main,menu);
    return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.coverPage:
                break;
            case R.id.Cal:
                Intent myIntent = new Intent(MainActivity.this,Calculator.class);
                startActivity(myIntent);
                break;
            case R.id.layout:
                Intent lIntent = new Intent(MainActivity.this,Layout_activity.class);
                startActivity(lIntent);
                break;
            case R.id.mList:
                break;

        }
        return super.onOptionsItemSelected(item);
    }



}
