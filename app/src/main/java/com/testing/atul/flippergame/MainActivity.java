package com.testing.atul.flippergame;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.Button;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //int blackbg = this.getResources().getColor(R.color.black);
    //int whitebg = this.getResources().getColor(R.color.white);
    static Button b11, b12, b13, b14, b21, b22, b23, b24, b31, b32, b33, b34, b41, b42, b43, b44;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        buttonInitializer();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "The reset function to be called", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        FloatingActionButton fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Test", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void buttonInitializer(){
        b11 = (Button)findViewById(R.id.bgrid_11);
        b12 = (Button)findViewById(R.id.bgrid_12);
        b13 = (Button)findViewById(R.id.bgrid_13);
        b14 = (Button)findViewById(R.id.bgrid_14);
        b21 = (Button)findViewById(R.id.bgrid_21);
        b22 = (Button)findViewById(R.id.bgrid_22);
        b23 = (Button)findViewById(R.id.bgrid_23);
        b24 = (Button)findViewById(R.id.bgrid_24);
        b31 = (Button)findViewById(R.id.bgrid_31);
        b32 = (Button)findViewById(R.id.bgrid_32);
        b33 = (Button)findViewById(R.id.bgrid_33);
        b34 = (Button)findViewById(R.id.bgrid_34);
        b41 = (Button)findViewById(R.id.bgrid_41);
        b42 = (Button)findViewById(R.id.bgrid_42);
        b43 = (Button)findViewById(R.id.bgrid_43);
        b44 = (Button)findViewById(R.id.bgrid_44);
    }

    @SuppressWarnings("deprecation")
    public void b11_clicked(View v){
        if(b21.getDrawingCacheBackgroundColor()==getResources().getColor(R.color.black))
            b21.setBackgroundColor(getResources().getColor(R.color.white));
        else
            b21.setBackgroundColor(getResources().getColor(R.color.white));

        if(b12.getDrawingCacheBackgroundColor()==getResources().getColor(R.color.black))
            b12.setBackgroundColor(getResources().getColor(R.color.white));
        else
            b12.setBackgroundColor(getResources().getColor(R.color.white));
    }

    public void b12_clicked(View v){
        if(b11.getDrawingCacheBackgroundColor()==getResources().getColor(R.color.black))
            b11.setBackgroundColor(getResources().getColor(R.color.white));
        else
            b11.setBackgroundColor(getResources().getColor(R.color.white));

        if(b22.getDrawingCacheBackgroundColor()==getResources().getColor(R.color.black))
            b22.setBackgroundColor(getResources().getColor(R.color.white));
        else
            b22.setBackgroundColor(getResources().getColor(R.color.white));

        if(b13.getDrawingCacheBackgroundColor()==getResources().getColor(R.color.black))
            b13.setBackgroundColor(getResources().getColor(R.color.white));
        else
            b13.setBackgroundColor(getResources().getColor(R.color.white));
    }

    public void b13_clicked(View v){
        if(b21.getDrawingCacheBackgroundColor()==getResources().getColor(R.color.black))
            b21.setBackgroundColor(getResources().getColor(R.color.white));
        else
            b21.setBackgroundColor(getResources().getColor(R.color.white));

        if(b12.getDrawingCacheBackgroundColor()==getResources().getColor(R.color.black))
            b12.setBackgroundColor(getResources().getColor(R.color.white));
        else
            b12.setBackgroundColor(getResources().getColor(R.color.white));
    }

    public void b11_clicked(View v){
        if(b21.getDrawingCacheBackgroundColor()==getResources().getColor(R.color.black))
            b21.setBackgroundColor(getResources().getColor(R.color.white));
        else
            b21.setBackgroundColor(getResources().getColor(R.color.white));

        if(b12.getDrawingCacheBackgroundColor()==getResources().getColor(R.color.black))
            b12.setBackgroundColor(getResources().getColor(R.color.white));
        else
            b12.setBackgroundColor(getResources().getColor(R.color.white));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        
    }
}
