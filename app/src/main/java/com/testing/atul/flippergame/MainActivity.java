package com.testing.atul.flippergame;

import android.annotation.TargetApi;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class MainActivity extends AppCompatActivity{

    int blackbg;
    int whitebg;
    int no_of_clicks;
    GridView table;
    TextView counter;

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blackbg = R.color.black;
        whitebg = R.color.white;
        counter = (TextView)findViewById(R.id.moves_box);
        counter.setText("0");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        table = (GridView) findViewById(R.id.gridView);
        table.setAdapter(new CustomAdapter(this));

        table.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                //Toast.makeText(MainActivity.this, "" + position,Toast.LENGTH_SHORT).show();
                no_of_clicks++;
                counter.setText(Integer.toString(no_of_clicks));
                flipColor(v,position);
            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        assert fab!= null;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "You reset.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                resetBoxes();
            }
        });

        FloatingActionButton fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        assert fab2 != null;
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Test", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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

    public void flipColor(View v,int pos){
        if(pos==0){
            View box = table.getChildAt(1);
            invertSingle(box);

            View box2 = table.getChildAt(4);
            invertSingle(box2);
        }
        if(pos==3){
            View box = table.getChildAt(2);
            invertSingle(box);

            View box2 = table.getChildAt(7);
            invertSingle(box2);
        }
        if(pos==12){
            View box = table.getChildAt(8);
            invertSingle(box);

            View box2 = table.getChildAt(13);
            invertSingle(box2);
        }
        if(pos==15){
            View box = table.getChildAt(14);
            invertSingle(box);

            View box2 = table.getChildAt(11);
            invertSingle(box2);
        }
        if(pos==1){
            View box = table.getChildAt(0);
            invertSingle(box);

            View box2 = table.getChildAt(2);
            invertSingle(box2);

            View box3 = table.getChildAt(5);
            invertSingle(box3);
        }
        if(pos==2){
            View box = table.getChildAt(1);
            invertSingle(box);

            View box2 = table.getChildAt(3);
            invertSingle(box2);

            View box3 = table.getChildAt(6);
            invertSingle(box3);
        }
        if(pos==4){
            View box = table.getChildAt(0);
            invertSingle(box);

            View box2 = table.getChildAt(5);
            invertSingle(box2);

            View box3 = table.getChildAt(8);
            invertSingle(box3);
        }
        if(pos==8){
            View box = table.getChildAt(4);
            invertSingle(box);

            View box2 = table.getChildAt(9);
            invertSingle(box2);

            View box3 = table.getChildAt(12);
            invertSingle(box3);
        }
        if(pos==7){
            View box = table.getChildAt(3);
            invertSingle(box);

            View box2 = table.getChildAt(6);
            invertSingle(box2);

            View box3 = table.getChildAt(11);
            invertSingle(box3);
        }
        if(pos==11){
            View box = table.getChildAt(10);
            invertSingle(box);

            View box2 = table.getChildAt(7);
            invertSingle(box2);

            View box3 = table.getChildAt(15);
            invertSingle(box3);
        }
        if(pos==13){
            View box = table.getChildAt(12);
            invertSingle(box);

            View box2 = table.getChildAt(14);
            invertSingle(box2);

            View box3 = table.getChildAt(9);
            invertSingle(box3);
        }
        if(pos==14){
            View box = table.getChildAt(13);
            invertSingle(box);

            View box2 = table.getChildAt(15);
            invertSingle(box2);

            View box3 = table.getChildAt(10);
            invertSingle(box3);
        }
        if(pos==5){
            View box = table.getChildAt(1);
            invertSingle(box);

            View box2 = table.getChildAt(4);
            invertSingle(box2);

            View box3 = table.getChildAt(6);
            invertSingle(box3);

            View box4 = table.getChildAt(9);
            invertSingle(box4);
        }
        if(pos==6){
            View box = table.getChildAt(2);
            invertSingle(box);

            View box2 = table.getChildAt(5);
            invertSingle(box2);

            View box3 = table.getChildAt(7);
            invertSingle(box3);

            View box4 = table.getChildAt(10);
            invertSingle(box4);
        }
        if(pos==9){
            View box = table.getChildAt(5);
            invertSingle(box);

            View box2 = table.getChildAt(8);
            invertSingle(box2);

            View box3 = table.getChildAt(10);
            invertSingle(box3);

            View box4 = table.getChildAt(13);
            invertSingle(box4);
        }
        if(pos==10){
            View box = table.getChildAt(6);
            invertSingle(box);

            View box2 = table.getChildAt(9);
            invertSingle(box2);

            View box3 = table.getChildAt(11);
            invertSingle(box3);

            View box4 = table.getChildAt(14);
            invertSingle(box4);
        }
    }
    public void invertSingle(View v){
        View box = v;
        if(((ColorDrawable)box.getBackground()).getColor()==blackbg)
            box.setBackgroundColor(whitebg);
        else
            box.setBackgroundColor(blackbg);
    }

    public void resetBoxes(){
        for ( int i = 0; i < 16; i++ ) {
            View box = table.getChildAt(i);
            box.setBackgroundColor(blackbg);
        }
        no_of_clicks=0;
        counter.setText(no_of_clicks);
    }
}
