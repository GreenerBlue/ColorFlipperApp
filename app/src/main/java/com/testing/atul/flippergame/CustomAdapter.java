package com.testing.atul.flippergame;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

/**
 * Created by Atul on 7/22/2016.
 */
public class CustomAdapter extends BaseAdapter {

    private Context con;

    public CustomAdapter(Context c) { this.con=c; }

    @Override
    public int getCount() {
        return 16; //Static for now Change Later.
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView tv;
        if (convertView == null) {
            tv = new TextView(con);
            tv.setLayoutParams(new GridView.LayoutParams(75, 75));
            tv.setPadding(10,10,10,10);
        } else
            tv = (TextView) convertView;

        tv.setText("");
        //noinspection ResourceAsColor
        tv.setBackgroundColor(R.color.black);
        return tv;
    }
}
