package com.android.ehorizontalselectedview.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.android.ehorizontalselectedview.EHorizontalSelectedView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EHorizontalSelectedView horizontalSelectedView = (EHorizontalSelectedView) findViewById(R.id.hsv);
        List<String>            objects                = new ArrayList<>();
        objects.add("1001");
        objects.add("1002");
        objects.add("1003");
        objects.add("1004");
        objects.add("1005");
        objects.add("1006");
        objects.add("1007");
        objects.add("1008");
        objects.add("1009");
        objects.add("10010");
        horizontalSelectedView.setData(objects);
        horizontalSelectedView.setSelectNum(4);
        horizontalSelectedView.setSeeSize(5);
        final TextView viewById = (TextView) findViewById(R.id.text);
        viewById.setText("移动到的是 :  " + objects.get(4));
        horizontalSelectedView.setOnRollingListener(new EHorizontalSelectedView.OnRollingListener() {
            @Override
            public void onRolling(int position, String s) {
                viewById.setText("移动到的是 :  " + s);
            }
        });
    }
}
